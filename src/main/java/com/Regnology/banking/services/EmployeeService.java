package com.Regnology.banking.services;

import com.Regnology.banking.models.RegEmployees;
import com.Regnology.banking.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepo;

    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<RegEmployees> allEmployees() {
        return employeeRepo.findAll();
    }
}
