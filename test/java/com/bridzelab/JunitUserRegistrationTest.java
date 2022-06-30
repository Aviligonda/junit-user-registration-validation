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

    @Test
    public void validEmailsValidationTest() {
        boolean actualOutPut = userRegistration.validEmailsValidation("abc@yahoo.com");
        Assert.assertTrue(actualOutPut);
        boolean actualOutPut1 = userRegistration.validEmailsValidation("abc-100@yahoo.com");
        Assert.assertTrue(actualOutPut1);
        boolean actualOutPut2 = userRegistration.validEmailsValidation("abc.100@yahoo.com");
        Assert.assertTrue(actualOutPut2);
        boolean actualOutPut3 = userRegistration.validEmailsValidation("abc111@abc.com");
        Assert.assertTrue(actualOutPut3);
        boolean actualOutPut4 = userRegistration.validEmailsValidation("abc-100@abc.net");
        Assert.assertTrue(actualOutPut4);
        boolean actualOutPut5 = userRegistration.validEmailsValidation("abc@1.com");
        Assert.assertTrue(actualOutPut5);
        boolean actualOutPut6 = userRegistration.validEmailsValidation("abc+100@gmail.com");
        Assert.assertTrue(actualOutPut6);
    }

    @Test
    public void inValidEmailsValidationTest() {
        boolean actualOutPut = userRegistration.inValidEmailValidation("abc");
        Assert.assertFalse(actualOutPut);
        boolean actualOutPut1 = userRegistration.inValidEmailValidation("abc@.com.my");
        Assert.assertFalse(actualOutPut1);
        boolean actualOutPut2 = userRegistration.inValidEmailValidation("abc123@gmail.a");
        Assert.assertFalse(actualOutPut2);
        boolean actualOutPut3 = userRegistration.inValidEmailValidation("abc123@.com");
        Assert.assertFalse(actualOutPut3);
        boolean actualOutPut4 = userRegistration.inValidEmailValidation("abc123@.com.com");
        Assert.assertFalse(actualOutPut4);
        boolean actualOutPut5 = userRegistration.inValidEmailValidation(".abc@abc.com");
        Assert.assertFalse(actualOutPut5);
        boolean actualOutPut6 = userRegistration.inValidEmailValidation("abc()*@gmail.com");
        Assert.assertFalse(actualOutPut6);
        boolean actualOutPut7 = userRegistration.inValidEmailValidation("abc()*@gmail.com");
        Assert.assertFalse(actualOutPut7);
        boolean actualOutPut8 = userRegistration.inValidEmailValidation("abc@%*.com");
        Assert.assertFalse(actualOutPut8);
        boolean actualOutPut9 = userRegistration.inValidEmailValidation("abc..2002@gmail.com");
        Assert.assertFalse(actualOutPut9);
        boolean actualOutPut10 = userRegistration.inValidEmailValidation("abc.@gmail.com");
        Assert.assertFalse(actualOutPut10);
        boolean actualOutPut11 = userRegistration.inValidEmailValidation("abc@abc@gmail.com");
        Assert.assertFalse(actualOutPut11);
        boolean actualOutPut12 = userRegistration.inValidEmailValidation("abc@gmail.com.1a ");
        Assert.assertFalse(actualOutPut12);
        boolean actualOutPut13 = userRegistration.inValidEmailValidation("abc@gmail.com.aa.au");
        Assert.assertFalse(actualOutPut13);
    }

}
