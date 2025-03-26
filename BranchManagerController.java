package ut.edu.project.Controllers;
import com.yourcompany.booking.models.BranchManager;
import com.yourcompany.booking.models.MakeupArtist;
import com.yourcompany.booking.services.BranchManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branch-manager")
public class BranchManagerController {

    private final BranchManagerService branchManagerService;

    public BranchManagerController(BranchManagerService branchManagerService) {
        this.branchManagerService = branchManagerService;
    }

    // Lấy thông tin Quản lý chi nhánh theo ID
    @GetMapping("/{id}")
    public ResponseEntity<BranchManager> getBranchManagerById(@PathVariable Long id) {
        return ResponseEntity.ok(branchManagerService.getBranchManagerById(id));
    }

    // Cập nhật thông tin Quản lý chi nhánh
    @PutMapping("/{id}")
    public ResponseEntity<BranchManager> updateBranchManager(@PathVariable Long id, @RequestBody BranchManager branchManager) {
        return ResponseEntity.ok(branchManagerService.updateBranchManager(id, branchManager));
    }

    // Xem lợi nhuận của chi nhánh
    @GetMapping("/{id}/profits")
    public ResponseEntity<Double> getBranchProfits(@PathVariable Long id) {
        return ResponseEntity.ok(branchManagerService.getBranchProfits(id));
    }

    // Quản lý nghệ sĩ trang điểm (lấy danh sách)
    @GetMapping("/{id}/makeup-artists")
    public ResponseEntity<List<MakeupArtist>> getMakeupArtists(@PathVariable Long id) {
        return ResponseEntity.ok(branchManagerService.getMakeupArtists(id));
    }

    // Quản lý lịch trình của chi nhánh (lấy danh sách)
    @GetMapping("/{id}/schedules")
    public ResponseEntity<List<?>> getBranchSchedules(@PathVariable Long id) {
        return ResponseEntity.ok(branchManagerService.getBranchSchedules(id));
    }

    // Xử lý phản hồi khách hàng
    @GetMapping("/{id}/feedbacks")
    public ResponseEntity<List<?>> getCustomerFeedbacks(@PathVariable Long id) {
        return ResponseEntity.ok(branchManagerService.getCustomerFeedbacks(id));
    }
}

