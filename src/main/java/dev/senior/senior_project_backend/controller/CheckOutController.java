package dev.senior.senior_project_backend.controller;

import dev.senior.senior_project_backend.model.CheckOut;
import dev.senior.senior_project_backend.service.CheckOutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkouts")
@RequiredArgsConstructor
public class CheckOutController {

    private final CheckOutService CheckOutService;

    // Create or Update CheckOut
    @PostMapping
    public ResponseEntity<CheckOut> saveCheckOut(@RequestBody CheckOut checkOut) {
        CheckOut savedCheckOut = CheckOutService.saveCheckOut(checkOut);
        return ResponseEntity.ok(savedCheckOut);
    }

    // Get CheckOut by ID
    @GetMapping("/{id}")
    public ResponseEntity<CheckOut> getCheckOutById(@PathVariable Long id) {
        return CheckOutService.findCheckOutById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get All CheckOuts
    @GetMapping
    public ResponseEntity<List<CheckOut>> getAllCheckOuts() {
        return ResponseEntity.ok(CheckOutService.findAllCheckOuts());
    }

    // Delete CheckOut by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCheckOut(@PathVariable Long id) {
        CheckOutService.deleteCheckOutById(id);
        return ResponseEntity.noContent().build();
    }
}

