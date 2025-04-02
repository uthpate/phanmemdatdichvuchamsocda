package ut.edu.project.Models;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "branch_managers")
public class BranchManager extends User {

    @Column(nullable = false)
    private String branchName;

    @Column(nullable = false)
    private String branchAddress;

    @Column(nullable = false)
    private String phoneNumber;
}
