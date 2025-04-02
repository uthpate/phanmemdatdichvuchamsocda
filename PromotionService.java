package ut.edu.project.Services;
import com.yourcompany.booking.models.Promotion;
import com.yourcompany.booking.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    // Lấy danh sách tất cả các chương trình khuyến mãi
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    // Tìm khuyến mãi theo ID
    public Optional<Promotion> getPromotionById(Long id) {
        return promotionRepository.findById(id);
    }

    // Tạo hoặc cập nhật khuyến mãi
    public Promotion savePromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    // Xóa khuyến mãi theo ID
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}
