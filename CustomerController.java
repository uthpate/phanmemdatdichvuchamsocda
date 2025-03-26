package ut.edu.project.Controllers;
import com.yourcompany.booking.models.Customer;
import com.yourcompany.booking.models.Appointment;
import com.yourcompany.booking.services.CustomerService;
import com.yourcompany.booking.services.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;
    private final AppointmentService appointmentService;

    public CustomerController(CustomerService customerService, AppointmentService appointmentService) {
        this.customerService = customerService;
        this.appointmentService = appointmentService;
    }

    // ✅ Đăng ký khách hàng mới
    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.registerCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }

    // ✅ Lấy thông tin khách hàng theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    // ✅ Cập nhật thông tin khách hàng
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
        return ResponseEntity.ok(customerService.updateCustomer(id, updatedCustomer));
    }

    // ✅ Xóa tài khoản khách hàng
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok("Khách hàng đã bị xóa thành công!");
    }

    // ✅ Xem danh sách cuộc hẹn của khách hàng
    @GetMapping("/{id}/appointments")
    public ResponseEntity<List<Appointment>> getCustomerAppointments(@PathVariable Long id) {
        return ResponseEntity.ok(appointmentService.getAppointmentsByCustomerId(id));
    }

    // ✅ Đặt lịch trang điểm
    @PostMapping("/{id}/appointments")
    public ResponseEntity<Appointment> bookAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        Appointment newAppointment = appointmentService.createAppointment(id, appointment);
        return ResponseEntity.ok(newAppointment);
    }
}
