package dev.senior.senior_project_backend.repository;

import dev.senior.senior_project_backend.model.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, Long> {
}
