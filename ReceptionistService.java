package ut.edu.project.Services;
import com.yourcompany.booking.models.Receptionist;
import com.yourcompany.booking.repositories.ReceptionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;

    // Lấy danh sách tất cả lễ tân
    public List<Receptionist> getAllReceptionists() {
        return receptionistRepository.findAll();
    }

    // Tìm lễ tân theo ID
    public Optional<Receptionist> getReceptionistById(Long id) {
        return receptionistRepository.findById(id);
    }

    // Lưu hoặc cập nhật thông tin lễ tân
    public Receptionist saveReceptionist(Receptionist receptionist) {
        return receptionistRepository.save(receptionist);
    }

    // Xóa lễ tân theo ID
    public void deleteReceptionist(Long id) {
        receptionistRepository.deleteById(id);
    }
}
