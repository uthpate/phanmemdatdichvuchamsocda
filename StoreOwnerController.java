package ut.edu.project.Controllers;
import com.yourcompany.booking.models.StoreOwner;
import com.yourcompany.booking.services.StoreOwnerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/store-owner")
public class StoreOwnerController {

    private final StoreOwnerService storeOwnerService;

    public StoreOwnerController(StoreOwnerService storeOwnerService) {
        this.storeOwnerService = storeOwnerService;
    }

    // Lấy thông tin chủ cửa hàng theo ID
    @GetMapping("/{id}")
    public ResponseEntity<StoreOwner> getStoreOwnerById(@PathVariable Long id) {
        return ResponseEntity.ok(storeOwnerService.getStoreOwnerById(id));
    }

    // Cập nhật thông tin chủ cửa hàng
    @PutMapping("/{id}")
    public ResponseEntity<StoreOwner> updateStoreOwner(@PathVariable Long id, @RequestBody StoreOwner storeOwner) {
        return ResponseEntity.ok(storeOwnerService.updateStoreOwner(id, storeOwner));
    }

    // Lấy danh sách tất cả chi nhánh
    @GetMapping("/branches")
    public ResponseEntity<List<?>> getAllBranches() {
        return ResponseEntity.ok(storeOwnerService.getAllBranches());
    }

    // Quản lý dịch vụ (lấy danh sách)
    @GetMapping("/services")
    public ResponseEntity<List<?>> getAllServices() {
        return ResponseEntity.ok(storeOwnerService.getAllServices());
    }

    // Quản lý chương trình khuyến mãi (lấy danh sách)
    @GetMapping("/promotions")
    public ResponseEntity<List<?>> getAllPromotions() {
        return ResponseEntity.ok(storeOwnerService.getAllPromotions());
    }

    // Xem lợi nhuận hệ thống
    @GetMapping("/profits")
    public ResponseEntity<Double> getSystemProfits() {
        return ResponseEntity.ok(storeOwnerService.getSystemProfits());
    }
}
