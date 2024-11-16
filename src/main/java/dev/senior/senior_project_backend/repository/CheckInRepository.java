package dev.senior.senior_project_backend.repository;

import dev.senior.senior_project_backend.model.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
}
