package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Tìm tất cả đánh giá của một nghệ sĩ trang điểm
    List<Review> findByMakeupArtistId(Long makeupArtistId);

    // Tìm tất cả đánh giá của một khách hàng
    List<Review> findByCustomerId(Long customerId);
}
