package dev.senior.senior_project_backend.controller;

import dev.senior.senior_project_backend.model.BlockDetail;
import dev.senior.senior_project_backend.service.BlockDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blockdetails")
@RequiredArgsConstructor
public class BlockDetailController {

    private final BlockDetailService BlockDetailService;

    // Create or Update BlockDetail
    @PostMapping
    public ResponseEntity<BlockDetail> saveBlockDetail(@RequestBody BlockDetail blockDetail) {
        BlockDetail savedBlockDetail = BlockDetailService.saveBlockDetail(blockDetail);
        return ResponseEntity.ok(savedBlockDetail);
    }

    // Get BlockDetail by ID
    @GetMapping("/{id}")
    public ResponseEntity<BlockDetail> getBlockDetailById(@PathVariable Long id) {
        return BlockDetailService.findBlockDetailById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get All BlockDetails
    @GetMapping
    public ResponseEntity<List<BlockDetail>> getAllBlockDetails() {
        return ResponseEntity.ok(BlockDetailService.findAllBlockDetails());
    }

    // Delete BlockDetail by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlockDetail(@PathVariable Long id) {
        BlockDetailService.deleteBlockDetailById(id);
        return ResponseEntity.noContent().build();
    }
}

