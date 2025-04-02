package ut.edu.project.Services;
import com.yourcompany.booking.models.Review;
import com.yourcompany.booking.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // Lấy danh sách tất cả các đánh giá
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    // Tìm đánh giá theo ID
    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    // Lưu hoặc cập nhật đánh giá
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    // Xóa đánh giá theo ID
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
