package com.tstcore.jpa_inheritance_hierarchy.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * SINGLE_Table is a default strategy for inheritance. It maps all classes in the hierarchy to a single table in the database.
 * Pain Point: columns from the parent class are repeated in the child class. M
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "employee_type")
public abstract class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
