package dev.senior.senior_project_backend.service;

import dev.senior.senior_project_backend.model.Block;
import dev.senior.senior_project_backend.repository.BlockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlockService {

    private final BlockRepository BlockRepository;

    // Create or Update a Block
    public Block saveBlock(Block block) {
        return BlockRepository.save(block);
    }

    // Find a Block by ID
    public Optional<Block> findBlockById(Long id) {
        return BlockRepository.findById(id);
    }

    // Get All Blocks
    public List<Block> findAllBlocks() {
        return BlockRepository.findAll();
    }

    // Delete a Block by ID
    public void deleteBlockById(Long id) {
        BlockRepository.deleteById(id);
    }
}


