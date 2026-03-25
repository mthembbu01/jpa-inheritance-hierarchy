package com.tstcore.jpa_inheritance_hierarchy.entities.dtos;

import com.tstcore.jpa_inheritance_hierarchy.enums.Type;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeCreateRequest {
    private String name;
    private BigDecimal salary;
    private BigDecimal hourlyWage;
    private Type type;
}
