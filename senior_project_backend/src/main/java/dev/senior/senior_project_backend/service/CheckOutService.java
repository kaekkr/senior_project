package dev.senior.senior_project_backend.service;

import dev.senior.senior_project_backend.model.CheckOut;
import dev.senior.senior_project_backend.repository.CheckOutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CheckOutService {

    private final CheckOutRepository CheckOutRepository;

    // Create or Update a CheckOut
    public CheckOut saveCheckOut(CheckOut checkOut) {
        return CheckOutRepository.save(checkOut);
    }

    // Find a CheckOut by ID
    public Optional<CheckOut> findCheckOutById(Long id) {
        return CheckOutRepository.findById(id);
    }

    // Get All CheckOuts
    public List<CheckOut> findAllCheckOuts() {
        return CheckOutRepository.findAll();
    }

    // Delete a CheckOut by ID
    public void deleteCheckOutById(Long id) {
        CheckOutRepository.deleteById(id);
    }
}


