package ut.edu.project.Repositories;
import com.yourcompany.booking.models.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StoreOwnerRepository extends JpaRepository<StoreOwner, Long> {

    //Tìm chủ cửa hàng theo email
    Optional<StoreOwner> findByEmail(String email);

    //Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);
}
