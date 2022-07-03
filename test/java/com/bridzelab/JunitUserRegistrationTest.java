package com.bridzelab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class JunitUserRegistrationTest {
    private static final JunitUserRegistration userRegistration = new JunitUserRegistration();
    private String userMail;
    private boolean actualOutPut;

    public JunitUserRegistrationTest(String userMail, boolean actualOutPut) {
        this.userMail = userMail;
        this.actualOutPut = actualOutPut;
    }

    @Parameterized.Parameters
    public static Collection multipleEmailsTest() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc+100@gmail.com", true},
                {"abc.10@gmail.com", true},
                {"abc-100@abc.net", true},
                {"abc@abc@gmail.com", false},
                {"abc", false},
                {"abc123@gmail.a", false}

        });
    }

    @Test
    public void emailChecker() {
        Assert.assertEquals(actualOutPut, userRegistration.validEmailsValidation(userMail));
    }

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