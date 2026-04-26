package com.Regnology.banking.models.enums;

public enum EnumGrade {
    Technical_Architect_II("Technical Architect II"),
    Senior_Consultant("Senior Consultant"),
    Consultant("Consultant"),
    Technical_Architect_III("Technical Architect III"),
    Senior_Developer("Senior Developer"),
    Technical_Architect_I("Technical Architect I");

    private final String dbValue;

    EnumGrade(String dbValue) {
        this.dbValue = dbValue;
    }

    public String getDbValue() {
        return dbValue;
    }

    public static EnumGrade fromDbValue(String dbValue) {
        for(EnumGrade grade : values()) {
            if(grade.dbValue.equals(dbValue))
                return grade;
        }
        throw new IllegalArgumentException("Unknown Grade: "+dbValue);
    }


}
