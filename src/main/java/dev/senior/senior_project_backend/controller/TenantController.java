package dev.senior.senior_project_backend.controller;

import dev.senior.senior_project_backend.model.Tenant;
import dev.senior.senior_project_backend.service.TenantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenants")
@RequiredArgsConstructor
public class TenantController {

    private final TenantService tenantService;

    // Create or Update Tenant
    @PostMapping
    public ResponseEntity<Tenant> saveTenant(@RequestBody Tenant tenant) {
        Tenant savedTenant = tenantService.saveTenant(tenant);
        return ResponseEntity.ok(savedTenant);
    }

    // Get Tenant by ID
    @GetMapping("/{id}")
    public ResponseEntity<Tenant> getTenantById(@PathVariable Long id) {
        return tenantService.findTenantById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get All Tenants
    @GetMapping
    public ResponseEntity<List<Tenant>> getAllTenants() {
        return ResponseEntity.ok(tenantService.findAllTenants());
    }

    // Delete Tenant by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTenant(@PathVariable Long id) {
        tenantService.deleteTenantById(id);
        return ResponseEntity.noContent().build();
    }
}

