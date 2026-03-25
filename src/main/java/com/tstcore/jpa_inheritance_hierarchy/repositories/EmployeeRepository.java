package com.tstcore.jpa_inheritance_hierarchy.repositories;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
