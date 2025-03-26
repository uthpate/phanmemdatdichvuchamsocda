package ut.edu.project.Controllers;
import com.yourcompany.booking.models.MakeupArtist;
import com.yourcompany.booking.services.MakeupArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/makeup-artists")
public class MakeupArtistController {

    private final MakeupArtistService makeupArtistService;

    public MakeupArtistController(MakeupArtistService makeupArtistService) {
        this.makeupArtistService = makeupArtistService;
    }

    // Lấy danh sách tất cả nghệ sĩ trang điểm
    @GetMapping
    public ResponseEntity<List<MakeupArtist>> getAllMakeupArtists() {
        return ResponseEntity.ok(makeupArtistService.getAllMakeupArtists());
    }

    // Lấy thông tin chi tiết một nghệ sĩ trang điểm theo ID
    @GetMapping("/{id}")
    public ResponseEntity<MakeupArtist> getMakeupArtistById(@PathVariable Long id) {
        return ResponseEntity.ok(makeupArtistService.getMakeupArtistById(id));
    }

    // Cập nhật hồ sơ nghệ sĩ trang điểm
    @PutMapping("/{id}")
    public ResponseEntity<MakeupArtist> updateMakeupArtist(@PathVariable Long id, @RequestBody MakeupArtist updatedArtist) {
        return ResponseEntity.ok(makeupArtistService.updateMakeupArtist(id, updatedArtist));
    }

    // Xem lịch trình làm việc của nghệ sĩ trang điểm
    @GetMapping("/{id}/appointments")
    public ResponseEntity<?> getArtistAppointments(@PathVariable Long id) {
        return ResponseEntity.ok(makeupArtistService.getAppointmentsByArtistId(id));
    }

    // Nghệ sĩ trang điểm có thể thay đổi trạng thái cuộc hẹn (đã hoàn thành, hủy)
    @PutMapping("/{id}/appointments/{appointmentId}/status")
    public ResponseEntity<?> updateAppointmentStatus(@PathVariable Long id, @PathVariable Long appointmentId, @RequestParam String status) {
        makeupArtistService.updateAppointmentStatus(id, appointmentId, status);
        return ResponseEntity.ok("Cập nhật trạng thái cuộc hẹn thành công!");
    }
}

