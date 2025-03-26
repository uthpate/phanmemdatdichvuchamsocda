package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //Tìm khách hàng theo email
    Optional<Customer> findByEmail(String email);

    //Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);

    //tìm khách hàng theo số điện thoại
    Optional<Customer> findByPhoneNumber(String phoneNumber);
}
