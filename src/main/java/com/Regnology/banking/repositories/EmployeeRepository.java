package com.Regnology.banking.repositories;

import com.Regnology.banking.models.RegEmployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<RegEmployees, Long> {
}
