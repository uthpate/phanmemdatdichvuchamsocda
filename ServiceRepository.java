package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    // Tìm dịch vụ theo tên
    List<Service> findByNameContainingIgnoreCase(String name);
}
