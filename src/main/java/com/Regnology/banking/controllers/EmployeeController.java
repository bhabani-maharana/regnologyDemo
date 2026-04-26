package com.Regnology.banking.controllers;

import com.Regnology.banking.models.RegEmployees;
import com.Regnology.banking.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployees() {
        List<RegEmployees> allEmp = empService.allEmployees();
        return ResponseEntity.ok(allEmp);
    }
}
