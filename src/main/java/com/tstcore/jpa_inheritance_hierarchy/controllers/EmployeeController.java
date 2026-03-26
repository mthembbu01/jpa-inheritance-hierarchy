package com.tstcore.jpa_inheritance_hierarchy.controllers;

import com.tstcore.jpa_inheritance_hierarchy.entities.Employee;
import com.tstcore.jpa_inheritance_hierarchy.entities.FullTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.PartTimeEmployee;
import com.tstcore.jpa_inheritance_hierarchy.entities.dtos.EmployeeCreateRequest;
import com.tstcore.jpa_inheritance_hierarchy.enums.Type;
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

    @GetMapping("/full-time")
    public ResponseEntity<Iterable<FullTimeEmployee>> getAllFullTimeEmployees(){
        return new ResponseEntity<>(employeeService.findAllFullTimeEmployees(),HttpStatus.OK);
    }

    @GetMapping("/part-time")
    public ResponseEntity<Iterable<PartTimeEmployee>> getAllPartTimeEmployees(){
        return new ResponseEntity<>(employeeService.findAllPartTimeEmployees(),HttpStatus.OK);
    }
}
