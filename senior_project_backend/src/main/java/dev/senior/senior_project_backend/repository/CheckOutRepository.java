package dev.senior.senior_project_backend.repository;

import dev.senior.senior_project_backend.model.CheckOut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckOutRepository extends JpaRepository<CheckOut, Long> {
}
