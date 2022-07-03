package com.bridzelab;

import java.util.regex.Pattern;

public class JunitUserRegistration {
    public boolean firstNameValidation(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}", firstName);
    }

    public boolean lastNameValidation(String lastName) {
        return Pattern.matches("[A-Z][a-z]{3,}", lastName);
    }

    public boolean emailValidation(String email) {
        return Pattern.matches("[a-z\\d_-]{5,}@[a-z]{3,}.[a-z]{3,}.[a-z]{2,}", email);
    }

    public boolean phoneNumberValidation(String phoneNumber) {
        return Pattern.matches("[+]91 [6789]\\d{9}", phoneNumber);
    }

    public boolean passwordValidation(String password) {
        return Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password);
    }

    public boolean validEmailsValidation(String email) {
        return Pattern.matches("[a-z\\d.+_-]{3,}@[a-z]{3,}.[a-z]{2,}", email);
    }

}
