package ut.edu.project.Services;
import com.yourcompany.booking.models.User;
import com.yourcompany.booking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Lấy danh sách tất cả người dùng
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Tìm người dùng theo ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Lưu hoặc cập nhật thông tin người dùng
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Xóa người dùng theo ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Tìm người dùng theo email (ví dụ: để đăng nhập)
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
