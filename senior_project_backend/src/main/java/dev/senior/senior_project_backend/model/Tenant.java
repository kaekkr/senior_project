package dev.senior.senior_project_backend.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String positionName;
    private String citizenOf;
    private String email;
    private String localPhone;
    private String cellPhone;
    private String school;

    private Boolean hasSpouse;
    private Integer childrenCount;

    private LocalDate arrivalDate;
    private LocalDate departureDate;

    @ManyToOne
    private Room room;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    private List<BlockDetail> blockDetails;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    private List<CheckIn> checkIns;

    @Enumerated(EnumType.STRING)
    private TenantType tenantType;
}
