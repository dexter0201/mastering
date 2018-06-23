package com.dw;

public class Address {
    private final String address1;
    private final String address2;
    private final String city;
    private final String postalCode;
    private final String countryCode;

    public Address(String address1, String address2, String city, String postalCode, String countryCode) {
        Validator.ensureNotEmpty(address1, "address1");
        Validator.ensureNotEmpty(city, "city");
        Validator.ensureNotEmpty(postalCode, "postalCode");
        Validator.ensureNotEmpty(countryCode, "countryCode");

        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
    }
}
