package com.tstcore.jpa_inheritance_hierarchy.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PartTimeEmployee extends Employee{

    @Builder
    public PartTimeEmployee(String name, BigDecimal hourlyWage) {
        super(null,name);
        this.hourlyWage = hourlyWage;
    }

    @Column(name = "hourly_wage")
    private BigDecimal hourlyWage;
}
