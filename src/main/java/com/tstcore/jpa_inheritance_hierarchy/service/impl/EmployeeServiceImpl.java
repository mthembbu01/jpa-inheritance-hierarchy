package com.tstcore.jpa_inheritance_hierarchy.service.impl;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.FullTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.PartTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.dtos.EmployeeCreateRequest;
import com.tstcore.jpa_inheritance_hierarchy.enums.Type;
import com.tstcore.jpa_inheritance_hierarchy.repositories.EmployeeRepository;
import com.tstcore.jpa_inheritance_hierarchy.service.IEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(EmployeeCreateRequest employeeRequest){
        //-- Declare the employee object
        Employee employee;
        //-- Check the employee type and create the object accordingly
        if (employeeRequest.getType().equals(Type.FULL_TIME)){
            employee = new FullTimeEmployee(employeeRequest.getName(), employeeRequest.getSalary());
        } else if (employeeRequest.getType().equals(Type.PART_TIME)){
            employee = new PartTimeEmployee(employeeRequest.getName(), employeeRequest.getHourlyWage());
        } else {
            throw new IllegalArgumentException("Invalid employee type: " + employeeRequest.getType());
        }
        //-- Save the employee
        Employee savedEmployee = employeeRepository.save(employee);
        //-- Log the saved employee
        log.info("Saved employee: {}", savedEmployee);
        //-- Return the saved employee
        return savedEmployee;
    }

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
