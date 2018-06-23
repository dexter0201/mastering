package com.dw;

class Validator {
    static void ensureNotEmpty(String field, String fieldName) {
        if (isBlank(field)) {
            throw new IllegalArgumentException(fieldName);
        }
    }

    static Boolean isBlank(String field) {
        return field == null || field.trim().length() == 0;
    }
}
