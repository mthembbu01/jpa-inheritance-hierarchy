package com.tstcore.jpa_inheritance_hierarchy.service;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.dtos.EmployeeCreateRequest;

import java.util.List;

public interface IEmployeeService {
    Employee save(EmployeeCreateRequest employeeRequest);
    List<Employee> findAll();
}
