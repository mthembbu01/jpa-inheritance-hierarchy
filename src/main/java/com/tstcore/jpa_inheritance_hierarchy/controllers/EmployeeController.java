package com.tstcore.jpa_inheritance_hierarchy.controllers;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.dtos.EmployeeCreateRequest;
import com.tstcore.jpa_inheritance_hierarchy.service.IEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeCreateRequest employeeRequest){
        return new ResponseEntity<>(employeeService.save(employeeRequest),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Employee>> getAllEmployees(){
        return new ResponseEntity<>(employeeService.findAll(),HttpStatus.OK);
    }
}
