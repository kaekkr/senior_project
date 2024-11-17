package dev.senior.senior_project_backend.controller;

import dev.senior.senior_project_backend.model.Block;
import dev.senior.senior_project_backend.service.BlockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocks")
@RequiredArgsConstructor
public class BlockController {

    private final BlockService BlockService;

    // Create or Update Block
    @PostMapping
    public ResponseEntity<Block> saveBlock(@RequestBody Block block) {
        Block savedBlock = BlockService.saveBlock(block);
        return ResponseEntity.ok(savedBlock);
    }

    // Get Block by ID
    @GetMapping("/{id}")
    public ResponseEntity<Block> getBlockById(@PathVariable Long id) {
        return BlockService.findBlockById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get All Blocks
    @GetMapping
    public ResponseEntity<List<Block>> getAllBlocks() {
        return ResponseEntity.ok(BlockService.findAllBlocks());
    }

    // Delete Block by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlock(@PathVariable Long id) {
        BlockService.deleteBlockById(id);
        return ResponseEntity.noContent().build();
    }
}

