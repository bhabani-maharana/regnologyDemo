package com.Regnology.banking.models;

import com.Regnology.banking.models.enums.EnumDept;
import com.Regnology.banking.models.enums.EnumGender;
import com.Regnology.banking.models.enums.EnumGrade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "regemployees", schema = "regnology")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegEmployees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true, length = 150)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", length = 50)
    private EnumGender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "department", length = 100)
    private EnumDept department;

    @Column(name = "salary", precision = 12, scale = 2)
    private BigDecimal salary;

    @Column(name = "cdl", length = 100)
    private String cdl;

    @Enumerated(EnumType.STRING)
    @Convert(converter = GradeConverter.class)
    @Column(name = "grade", length = 100)
    private EnumGrade grade;


}
