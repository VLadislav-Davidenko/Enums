package com.company.enums;

public enum UserStatus {
    NEW("Новый"),
    ACTIVE("Активный"),
    INVISIBLE("Ниндзя"),
    NOT_ACTIVE("Неактивный");

    private String label;

    UserStatus(String label) {
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
