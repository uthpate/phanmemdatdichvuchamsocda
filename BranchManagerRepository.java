package ut.edu.project.Repositories;
package com.yourcompany.booking.repositories;

import com.yourcompany.booking.models.BranchManager;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BranchManagerRepository extends JpaRepository<BranchManager, Long> {

    //Tìm Branch Manager theo email
    Optional<BranchManager> findByEmail(String email);

    // Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);
}
