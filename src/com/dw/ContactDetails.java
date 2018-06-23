package com.dw;

public class ContactDetails {
    private final String homePhone;
    private final String mobilePhone;
    private final String emailAddress;

    public ContactDetails(String homePhone, String mobilePhone, String emailAddress) {
        Validator.ensureNotEmpty(emailAddress, "emailAddress");

        if (Validator.isBlank(homePhone) && Validator.isBlank(mobilePhone)) {
            throw new IllegalArgumentException("homePhone or mobilePhone is needed");
        }

        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.emailAddress = emailAddress;
    }
}