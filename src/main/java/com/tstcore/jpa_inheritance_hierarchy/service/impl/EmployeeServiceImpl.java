package com.tstcore.jpa_inheritance_hierarchy.service.impl;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.FullTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.PartTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.dtos.EmployeeCreateRequest;
import com.tstcore.jpa_inheritance_hierarchy.enums.Type;
import com.tstcore.jpa_inheritance_hierarchy.repositories.FullTimeRepository;
import com.tstcore.jpa_inheritance_hierarchy.repositories.PartTimeRepository;
import com.tstcore.jpa_inheritance_hierarchy.service.IEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final FullTimeRepository fullTimeRepository;
    private final PartTimeRepository partTimeRepository;

    public EmployeeServiceImpl(FullTimeRepository fullTimeRepository, PartTimeRepository partTimeRepository) {
        this.fullTimeRepository = fullTimeRepository;
        this.partTimeRepository = partTimeRepository;
    }

    @Override
    public Employee save(EmployeeCreateRequest employeeRequest){
        //-- Declare the employee object
        Employee savedEmployee = null;
        //-- Check the employee type and create the object accordingly
        if (employeeRequest.getType().equals(Type.FULL_TIME)){
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(employeeRequest.getName(), employeeRequest.getSalary());
            //-- Save the employee
            savedEmployee = fullTimeRepository.save(fullTimeEmployee);
        } else if (employeeRequest.getType().equals(Type.PART_TIME)){
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(employeeRequest.getName(), employeeRequest.getHourlyWage());
            savedEmployee = partTimeRepository.save(partTimeEmployee);
        } else {
            throw new IllegalArgumentException("Invalid employee type: " + employeeRequest.getType());
        }

        //-- Log the saved employee
        log.info("Saved employee: {}", savedEmployee);
        //-- Return the saved employee
        return savedEmployee;
    }

    @Override
    public Iterable<FullTimeEmployee> findAllFullTimeEmployees(){
            return fullTimeRepository.findAll();
    }

    @Override
    public Iterable<PartTimeEmployee> findAllPartTimeEmployees(){
            return partTimeRepository.findAll();
    }
}
