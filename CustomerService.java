package ut.edu.project.Services;
import com.yourcompany.booking.models.Customer;
import com.yourcompany.booking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Lấy danh sách tất cả khách hàng
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Tìm khách hàng theo ID
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Lưu hoặc cập nhật thông tin khách hàng
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Xóa khách hàng theo ID
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
