package com.bridzelab;

import org.junit.Assert;
import org.junit.Test;

public class JunitUserRegistrationTest {
    private static final JunitUserRegistration userRegistration = new JunitUserRegistration();

    @Test
    public void positiveFirstNameValidationTest() {
        boolean actualOutPut = userRegistration.firstNameValidation("Aviligonda");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativeFirstNameValidationTest() {
        boolean actualOutPut = userRegistration.firstNameValidation("aviligonda");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positiveLastNameValidationTest() {
        boolean actualOutPut = userRegistration.lastNameValidation("Srinivas");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativeLastNameValidationTest() {
        boolean actualOutPut = userRegistration.lastNameValidation("srinivas");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positiveEmailValidationTest() {
        boolean actualOutPut = userRegistration.emailValidation("aviligonda_sreenivasulu-123@gamil.com.in");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativeEmailValidationTest() {
        boolean actualOutPut = userRegistration.emailValidation("srinivas@com.in");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positivePhoneNumberValidationTest() {
        boolean actualOutPut = userRegistration.phoneNumberValidation("+91 8919584625");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativePhoneNumberValidationTest() {
        boolean actualOutPut = userRegistration.phoneNumberValidation("+918919584625");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positivePasswordValidationTest() {
        boolean actualOutPut = userRegistration.passwordValidation("Srinivas6#");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativePasswordValidationTest() {
        boolean actualOutPut = userRegistration.passwordValidation("srinivas6*");
        Assert.assertTrue(actualOutPut);
    }

}
