package ut.edu.project.Repositories;
import com.yourcompany.booking.models.MakeupArtist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface MakeupArtistRepository extends JpaRepository<MakeupArtist, Long> {

    //Tìm nghệ sĩ trang điểm theo email
    Optional<MakeupArtist> findByEmail(String email);

    //Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);

    //Lấy danh sách nghệ sĩ theo chi nhánh
    List<MakeupArtist> findByBranchId(Long branchId);
}
