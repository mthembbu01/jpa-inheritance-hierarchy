package com.tstcore.jpa_inheritance_hierarchy.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public abstract class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
