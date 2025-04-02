package ut.edu.project.Models;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "store_owners")
public class StoreOwner extends User {

    @Column(nullable = false)
    private String storeName;

    @Column(nullable = false)
    private String businessLicense;

    @Column(nullable = false)
    private String address;
}
