package com.tstcore.jpa_inheritance_hierarchy.service;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.FullTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.PartTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.dtos.EmployeeCreateRequest;
import com.tstcore.jpa_inheritance_hierarchy.enums.Type;

import java.util.List;

public interface IEmployeeService {
    Employee save(EmployeeCreateRequest employeeRequest);
    Iterable<FullTimeEmployee> findAllFullTimeEmployees();
    Iterable<PartTimeEmployee> findAllPartTimeEmployees();
}
