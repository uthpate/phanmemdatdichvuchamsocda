package ut.edu.project.Services;
import com.yourcompany.booking.models.StoreOwner;
import com.yourcompany.booking.repositories.StoreOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreOwnerService {

    @Autowired
    private StoreOwnerRepository storeOwnerRepository;

    // Lấy danh sách tất cả chủ cửa hàng
    public List<StoreOwner> getAllStoreOwners() {
        return storeOwnerRepository.findAll();
    }

    // Tìm chủ cửa hàng theo ID
    public Optional<StoreOwner> getStoreOwnerById(Long id) {
        return storeOwnerRepository.findById(id);
    }

    // Lưu hoặc cập nhật thông tin chủ cửa hàng
    public StoreOwner saveStoreOwner(StoreOwner storeOwner) {
        return storeOwnerRepository.save(storeOwner);
    }

    // Xóa chủ cửa hàng theo ID
    public void deleteStoreOwner(Long id) {
        storeOwnerRepository.deleteById(id);
    }
}
