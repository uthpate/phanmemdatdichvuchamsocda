package ut.edu.project.Repositories;
import com.yourcompany.booking.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByCustomerId(Long customerId);

    List<Appointment> findByMakeupArtistId(Long makeupArtistId);

    List<Appointment> findByStatus(String status);

    List<Appointment> findByAppointmentTimeBetween(LocalDateTime start, LocalDateTime end);
}
