package com.bridzelab;

import org.junit.Assert;
import org.junit.Test;

public class JunitUserRegistrationTest {
    static JunitUserRegistration userRegistration = new JunitUserRegistration();

    @Test
    public void positiveFirstNameValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.firstNameValidation("Srinivas"));
    }

    @Test
    public void negativeFirstNameValidationTest() {
        try {
            userRegistration.firstNameValidation("sa");
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positiveLastNameValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.lastNameValidation("avi"));
    }

    @Test
    public void negativeLastNameValidationTest() {
        try {
            Assert.assertTrue(userRegistration.lastNameValidation("sr@12"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }


    }

    @Test
    public void positiveEmailValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.emailValidation("srinivas6086@gmail.com"));
    }

    @Test
    public void negativeEmailValidationTest() {
        try {
            Assert.assertTrue(userRegistration.emailValidation("avi..123@gamil.com"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePhoneNumberValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.phoneNumberValidation("+91 8919584625"));
    }

    @Test
    public void negativePhoneNumberValidationTest() {
        try {
            Assert.assertTrue(userRegistration.phoneNumberValidation("+91 01245"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePassWordValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.passwordValidation("Srinivas@6087"));
    }

    @Test
    public void negativePasswordValidationTest() {
        try {
            Assert.assertTrue(userRegistration.passwordValidation("rin@ivas1@"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }
}