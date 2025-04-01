package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

    //Tìm lễ tân theo email
    Optional<Receptionist> findByEmail(String email);

    //Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);
}
