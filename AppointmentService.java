package ut.edu.project.Services;
import com.yourcompany.booking.models.Appointment;
import com.yourcompany.booking.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Lấy danh sách tất cả các cuộc hẹn
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // Tìm cuộc hẹn theo ID
    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }

    // Tạo hoặc cập nhật cuộc hẹn
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Xóa cuộc hẹn theo ID
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}
