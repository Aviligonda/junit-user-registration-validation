package com.bridzelab;

import java.util.regex.Pattern;
@FunctionalInterface
interface LambdaOperation{
    String validate(String regex,String input);
}
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

    public static void main(String[] args) {
        //FirstName validation
        LambdaOperation firstName = (regex, input) -> {
            return "First Name Validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(firstName.validate("[A-Z][a-z]{2,}", "Srinivas"));
        // LastName validation
        LambdaOperation lastName = (regex, input) -> {
            return "Last name validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(lastName.validate("[A-Z][a-z]{2,}", "Avilionda"));
        // Email validation
        LambdaOperation email = (regex, input) -> {
            return "Email validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(email.validate("^[a-z\\d\\-]+(\\.[\\w+-]+)*@\\w+(\\.\\w+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$", "srinivas-123@gmail.com.in"));
        // Phone number validation
        LambdaOperation phoneNumber = (regex, input) -> {
            return "Phone number validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(phoneNumber.validate("[+]91 [6789]\\d{9}", "+91 8919584625"));
        //password validation
        LambdaOperation password = (regex, input) -> {
            return "Password  validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(password.validate("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", "Srinivas#22"));

    }
}
