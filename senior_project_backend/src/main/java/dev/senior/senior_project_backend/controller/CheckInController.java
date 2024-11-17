package dev.senior.senior_project_backend.controller;

import dev.senior.senior_project_backend.model.CheckIn;
import dev.senior.senior_project_backend.service.CheckInService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkins")
@RequiredArgsConstructor
public class CheckInController {

    private final CheckInService CheckInService;

    // Create or Update CheckIn
    @PostMapping
    public ResponseEntity<CheckIn> saveCheckIn(@RequestBody CheckIn checkIn) {
        CheckIn savedCheckIn = CheckInService.saveCheckIn(checkIn);
        return ResponseEntity.ok(savedCheckIn);
    }

    // Get CheckIn by ID
    @GetMapping("/{id}")
    public ResponseEntity<CheckIn> getCheckInById(@PathVariable Long id) {
        return CheckInService.findCheckInById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get All CheckIns
    @GetMapping
    public ResponseEntity<List<CheckIn>> getAllCheckIns() {
        return ResponseEntity.ok(CheckInService.findAllCheckIns());
    }

    // Delete CheckIn by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCheckIn(@PathVariable Long id) {
        CheckInService.deleteCheckInById(id);
        return ResponseEntity.noContent().build();
    }
}

