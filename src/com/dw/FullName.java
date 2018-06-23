package com.dw;

public class FullName {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public FullName(String firstName, String lastName, String middleName) {
        Validator.ensureNotEmpty(firstName, "firstName");
        Validator.ensureNotEmpty(lastName, "lastName");

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
}
