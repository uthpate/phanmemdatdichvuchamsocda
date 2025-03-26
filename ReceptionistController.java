package ut.edu.project.Controllers;
import com.yourcompany.booking.models.Receptionist;
import com.yourcompany.booking.models.Appointment;
import com.yourcompany.booking.services.ReceptionistService;
import com.yourcompany.booking.services.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receptionists")
public class ReceptionistController {

    private final ReceptionistService receptionistService;
    private final AppointmentService appointmentService;

    public ReceptionistController(ReceptionistService receptionistService, AppointmentService appointmentService) {
        this.receptionistService = receptionistService;
        this.appointmentService = appointmentService;
    }

    // Lấy danh sách tất cả lễ tân
    @GetMapping
    public ResponseEntity<List<Receptionist>> getAllReceptionists() {
        return ResponseEntity.ok(receptionistService.getAllReceptionists());
    }

    // Lấy thông tin lễ tân theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Receptionist> getReceptionistById(@PathVariable Long id) {
        return ResponseEntity.ok(receptionistService.getReceptionistById(id));
    }

    // Cập nhật hồ sơ lễ tân
    @PutMapping("/{id}")
    public ResponseEntity<Receptionist> updateReceptionist(@PathVariable Long id, @RequestBody Receptionist receptionistDetails) {
        return ResponseEntity.ok(receptionistService.updateReceptionist(id, receptionistDetails));
    }

    // Xóa lễ tân
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReceptionist(@PathVariable Long id) {
        receptionistService.deleteReceptionist(id);
        return ResponseEntity.noContent().build();
    }

    // Lấy danh sách tất cả các cuộc hẹn do lễ tân quản lý
    @GetMapping("/{id}/appointments")
    public ResponseEntity<List<Appointment>> getAppointmentsByReceptionist(@PathVariable Long id) {
        return ResponseEntity.ok(appointmentService.getAppointmentsByReceptionist(id));
    }

    // Cập nhật trạng thái cuộc hẹn
    @PutMapping("/appointments/{appointmentId}/status")
    public ResponseEntity<Appointment> updateAppointmentStatus(
            @PathVariable Long appointmentId,
            @RequestParam String status) {
        return ResponseEntity.ok(appointmentService.updateAppointmentStatus(appointmentId, status));
    }
}

