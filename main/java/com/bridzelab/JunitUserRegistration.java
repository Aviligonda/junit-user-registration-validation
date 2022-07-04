package com.bridzelab;

import java.util.regex.Pattern;


public class JunitUserRegistration {
    public boolean firstNameValidation(String firstName) throws InvalidInputExceptionError {
        if (Pattern.matches("[A-Z][a-z]{2,}", firstName))
            return true;
        else
            throw new InvalidInputExceptionError("You enter Invalid First Name");
    }


    public boolean lastNameValidation(String lastName) throws InvalidInputExceptionError {
        if (Pattern.matches("[A-Z][a-z]{2,}", lastName))
            return true;
        else
            throw new InvalidInputExceptionError("You enter Invalid Last Name ");
    }

    public boolean emailValidation(String email) throws InvalidInputExceptionError {
        if (Pattern.matches("[\\w+-]+(\\.[\\w+-]+)*@\\w+(\\.\\w+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*", email))
            return true;
        else
            throw new InvalidInputExceptionError("You enter invalid mail");
    }

    public boolean phoneNumberValidation(String phoneNumber) throws InvalidInputExceptionError {
        if (Pattern.matches("[+]91 [6-9]\\d{9}", phoneNumber))
            return true;
        else
            throw new InvalidInputExceptionError("You enter invalid Phone number");
    }


    public boolean passwordValidation(String password) throws InvalidInputExceptionError {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new InvalidInputExceptionError("You Enter invalid Password");
    }
}
