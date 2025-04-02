package ut.edu.project.Models;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "makeup_artists")
public class MakeupArtist extends User {  // Kế thừa từ User
    @Column(name = "skills")
    private String skills; // Kỹ năng (VD: Cô dâu, hóa trang, sự kiện,...)

    @Column(name = "experience")
    private int experience; // Số năm kinh nghiệm

    @Column(name = "rating")
    private double rating; // Đánh giá trung bình từ khách hàng

    @OneToMany(mappedBy = "makeupArtist", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments; // Danh sách cuộc hẹn của nghệ sĩ

    // ==== CONSTRUCTORS ====
    public MakeupArtist() {}

    public MakeupArtist(String fullName, String email, String phone, String skills, int experience, double rating) {
        super(fullName, email, phone); // Gọi constructor của User
        this.skills = skills;
        this.experience = experience;
        this.rating = rating;
    }

    // ==== GETTERS & SETTERS ====
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}

