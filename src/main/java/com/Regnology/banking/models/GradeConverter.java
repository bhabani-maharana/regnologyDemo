package com.Regnology.banking.models;

import com.Regnology.banking.models.enums.EnumGrade;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class GradeConverter implements AttributeConverter<EnumGrade, String> {
    @Override
    public String convertToDatabaseColumn(EnumGrade grade) {
        return grade != null ? grade.getDbValue() : null;
    }

    @Override
    public EnumGrade convertToEntityAttribute(String dbValue) {
        return dbValue != null ? EnumGrade.fromDbValue(dbValue) : null;
    }
}
