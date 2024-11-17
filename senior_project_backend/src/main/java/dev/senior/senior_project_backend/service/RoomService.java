package dev.senior.senior_project_backend.service;

import dev.senior.senior_project_backend.model.Room;
import dev.senior.senior_project_backend.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    // Create or Update a Room
    public Room saveroom(Room room) {
        return roomRepository.save(room);
    }

    // Find a Room by ID
    public Optional<Room> findRoomById(Long id) {
        return roomRepository.findById(id);
    }

    // Get All Rooms
    public List<Room> findAllRooms() {
        return roomRepository.findAll();
    }

    // Delete a Room by ID
    public void deleteRoomById(Long id) {
        roomRepository.deleteById(id);
    }
}


