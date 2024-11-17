package dev.senior.senior_project_backend.service;

import dev.senior.senior_project_backend.model.BlockDetail;
import dev.senior.senior_project_backend.repository.BlockDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlockDetailService {

    private final BlockDetailRepository BlockDetailRepository;

    // Create or Update a BlockDetail
    public BlockDetail saveBlockDetail(BlockDetail blockDetail) {
        return BlockDetailRepository.save(blockDetail);
    }

    // Find a BlockDetail by ID
    public Optional<BlockDetail> findBlockDetailById(Long id) {
        return BlockDetailRepository.findById(id);
    }

    // Get All BlockDetails
    public List<BlockDetail> findAllBlockDetails() {
        return BlockDetailRepository.findAll();
    }

    // Delete a BlockDetail by ID
    public void deleteBlockDetailById(Long id) {
        BlockDetailRepository.deleteById(id);
    }
}


