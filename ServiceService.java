package ut.edu.project.Services;
import com.yourcompany.booking.models.Service;
import com.yourcompany.booking.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    // Lấy danh sách tất cả các dịch vụ
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    // Tìm dịch vụ theo ID
    public Optional<Service> getServiceById(Long id) {
        return serviceRepository.findById(id);
    }

    // Tạo hoặc cập nhật dịch vụ
    public Service saveService(Service service) {
        return serviceRepository.save(service);
    }

    // Xóa dịch vụ theo ID
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
