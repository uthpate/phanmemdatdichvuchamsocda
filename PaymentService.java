package ut.edu.project.Services;
import com.yourcompany.booking.models.Payment;
import com.yourcompany.booking.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Lấy danh sách tất cả các khoản thanh toán
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Tìm thông tin thanh toán theo ID
    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    // Tạo hoặc cập nhật thông tin thanh toán
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Xóa thông tin thanh toán theo ID
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
