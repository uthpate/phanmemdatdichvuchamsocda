package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

    // Tìm tất cả các chương trình khuyến mãi đang hoạt động
    List<Promotion> findByIsActiveTrue();

    // Tìm khuyến mãi theo tên
    List<Promotion> findByNameContainingIgnoreCase(String name);

    // Tìm khuyến mãi theo khoảng giảm giá
    List<Promotion> findByDiscountPercentageBetween(double min, double max);
}
