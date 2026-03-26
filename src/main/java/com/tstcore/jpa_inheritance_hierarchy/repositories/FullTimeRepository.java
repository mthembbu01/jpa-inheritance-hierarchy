package com.tstcore.jpa_inheritance_hierarchy.repositories;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.FullTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FullTimeRepository extends JpaRepository<FullTimeEmployee, Long> {
}
