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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FullTimeEmployee extends Employee{



    @Column(name = "salary")
    private BigDecimal Salary;

    @Builder
    public FullTimeEmployee(String name, BigDecimal salary) {
        super(null,name);
        this.Salary  = salary;

    }
}
