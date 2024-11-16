package dev.senior.senior_project_backend.repository;

import dev.senior.senior_project_backend.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
