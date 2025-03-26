package ut.edu.project.Controllers;
import com.yourcompany.booking.dtos.AuthRequest;
import com.yourcompany.booking.dtos.AuthResponse;
import com.yourcompany.booking.dtos.RegisterRequest;
import com.yourcompany.booking.models.User;
import com.yourcompany.booking.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // Đăng ký tài khoản
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    // Đăng nhập và lấy JWT
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    // Đăng xuất (JWT sẽ hết hạn ở client)
    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("Logged out successfully");
    }
}

}
