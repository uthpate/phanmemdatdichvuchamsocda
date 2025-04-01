package ut.edu.project.Repositories;
import com.yourcompany.booking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Tìm User theo email (dành cho đăng nhập)
    Optional<User> findByEmail(String email);

    // Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);
}
