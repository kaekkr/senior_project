package dev.senior.senior_project_backend.repository;

import dev.senior.senior_project_backend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
