package dev.senior.senior_project_backend.model;

import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlockDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Tenant tenant;

    private Short floor;
    private String numberOfBedrooms;
    private String blockName;
    private String statement;
    private String reasonOfCheckIn;
    private BigDecimal totalArea;
    private Integer roomNumber;
}

