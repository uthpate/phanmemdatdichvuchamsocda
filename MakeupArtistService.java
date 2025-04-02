package ut.edu.project.Services;
import com.yourcompany.booking.models.MakeupArtist;
import com.yourcompany.booking.repositories.MakeupArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakeupArtistService {

    @Autowired
    private MakeupArtistRepository makeupArtistRepository;

    // Lấy danh sách tất cả nghệ sĩ trang điểm
    public List<MakeupArtist> getAllMakeupArtists() {
        return makeupArtistRepository.findAll();
    }

    // Tìm nghệ sĩ trang điểm theo ID
    public Optional<MakeupArtist> getMakeupArtistById(Long id) {
        return makeupArtistRepository.findById(id);
    }

    // Lưu hoặc cập nhật thông tin nghệ sĩ trang điểm
    public MakeupArtist saveMakeupArtist(MakeupArtist makeupArtist) {
        return makeupArtistRepository.save(makeupArtist);
    }

    // Xóa nghệ sĩ trang điểm theo ID
    public void deleteMakeupArtist(Long id) {
        makeupArtistRepository.deleteById(id);
    }
}
