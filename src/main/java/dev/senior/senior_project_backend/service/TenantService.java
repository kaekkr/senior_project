package dev.senior.senior_project_backend.service;

import dev.senior.senior_project_backend.model.Tenant;
import dev.senior.senior_project_backend.repository.TenantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository tenantRepository;

    // Create or Update a Tenant
    public Tenant saveTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    // Find a Tenant by ID
    public Optional<Tenant> findTenantById(Long id) {
        return tenantRepository.findById(id);
    }

    // Get All Tenants
    public List<Tenant> findAllTenants() {
        return tenantRepository.findAll();
    }

    // Delete a Tenant by ID
    public void deleteTenantById(Long id) {
        tenantRepository.deleteById(id);
    }
}

