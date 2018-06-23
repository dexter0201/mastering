package com.dw;

public class User {
    private final FullName fullName;
    private final ContactDetails contactDetails;
    private final Address address;

    public User(FullName fullName, ContactDetails contactDetails, Address address) {
        ensureNotNull(fullName, "fullName");
        ensureNotNull(contactDetails, "contactDetails");
        ensureNotNull(address, "address");

        this.fullName = fullName;
        this.contactDetails = contactDetails;
        this.address = address;
    }

    private void ensureNotNull(Object field, String fieldName) {
        if (field == null) {
            throw new IllegalArgumentException(fieldName);
        }
    }
}

