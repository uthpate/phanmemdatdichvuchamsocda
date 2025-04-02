package ut.edu.project.Services;
import com.yourcompany.booking.models.BranchManager;
import com.yourcompany.booking.repositories.BranchManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchManagerService {

    @Autowired
    private BranchManagerRepository branchManagerRepository;

    // Lấy danh sách tất cả các quản lý chi nhánh
    public List<BranchManager> getAllBranchManagers() {
        return branchManagerRepository.findAll();
    }

    // Tìm quản lý chi nhánh theo ID
    public Optional<BranchManager> getBranchManagerById(Long id) {
        return branchManagerRepository.findById(id);
    }

    // Lưu hoặc cập nhật thông tin quản lý chi nhánh
    public BranchManager saveBranchManager(BranchManager branchManager) {
        return branchManagerRepository.save(branchManager);
    }

    // Xóa quản lý chi nhánh theo ID
    public void deleteBranchManager(Long id) {
        branchManagerRepository.deleteById(id);
    }
}
