package com.tstcore.jpa_inheritance_hierarchy.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "part_time_employees")
public class FullTimeEmployee extends Employee{



    @Column(name = "hourly_wage", nullable = false)
    private BigDecimal Salary;
}
