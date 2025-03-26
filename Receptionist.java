package ut.edu.project.Models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "receptionists")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private BranchManager branchManager;

    @OneToMany(mappedBy = "receptionist", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
