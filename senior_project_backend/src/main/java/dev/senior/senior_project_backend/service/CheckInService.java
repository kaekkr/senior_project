package dev.senior.senior_project_backend.service;

import dev.senior.senior_project_backend.model.CheckIn;
import dev.senior.senior_project_backend.repository.CheckInRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CheckInService {

    private final CheckInRepository CheckInRepository;

    // Create or Update a CheckIn
    public CheckIn saveCheckIn(CheckIn checkIn) {
        return CheckInRepository.save(checkIn);
    }

    // Find a CheckIn by ID
    public Optional<CheckIn> findCheckInById(Long id) {
        return CheckInRepository.findById(id);
    }

    // Get All CheckIns
    public List<CheckIn> findAllCheckIns() {
        return CheckInRepository.findAll();
    }

    // Delete a CheckIn by ID
    public void deleteCheckInById(Long id) {
        CheckInRepository.deleteById(id);
    }
}


