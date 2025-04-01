package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    // Tìm tất cả các khoản thanh toán theo trạng thái (Pending, Completed, Failed)
    List<Payment> findByStatus(String status);

    // Tìm tất cả các khoản thanh toán theo ID khách hàng
    List<Payment> findByCustomerId(Long customerId);

    // Tìm tất cả các khoản thanh toán liên quan đến một cuộc hẹn cụ thể
    List<Payment> findByAppointmentId(Long appointmentId);
}
