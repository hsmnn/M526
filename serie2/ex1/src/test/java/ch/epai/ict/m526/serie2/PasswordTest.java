package ch.epai.ict.m526.serie2;

import junit.framework.Assert;

public class PasswordTest {

    public void checkCaracterNumberTrue() {
        String password = "ouiouioui";
        Password newPassword = new Password(password);
        boolean expected = true;
        boolean actual = newPassword.checkCaracterNumber();
        Assert.assertEquals(expected, actual);
    }

    public void checkCaracterNumberFalse() {
        String password = "ouiouiou";
        Password newPassword = new Password(password);
        boolean expected = false;
        boolean actual = newPassword.checkCaracterNumber();
        Assert.assertEquals(expected, actual);
    }

    public void checkLowerCaseTrue() {
        String password = "Ouiouioui";
        Password newPassword = new Password(password);
        boolean expected = true;
        boolean actual = newPassword.checkLowerCase();
        Assert.assertEquals(expected, actual);
    }

    public void checkLowerCaseFalse() {
        String password = "ouiouioui";
        Password newPassword = new Password(password);
        boolean expected = false;
        boolean actual = newPassword.checkLowerCase();
        Assert.assertEquals(expected, actual);
    }

    public void checkNumberTrue() {
        String password = "2";
        Password newPassword = new Password(password);
        boolean expected = true;
        boolean actual = newPassword.checkNumber();
        Assert.assertEquals(expected, actual);
    }

    public void checkNumberFalse() {
        String password = "ouiouioui";
        Password newPassword = new Password(password);
        boolean expected = false;
        boolean actual = newPassword.checkNumber();
        Assert.assertEquals(expected, actual);
    }

    public void isValidTrue() {
        String password = "Ouiouioui7";
        Password newPassword = new Password(password);
        boolean expected = true;
        boolean actual = newPassword.isValid();
        Assert.assertEquals(expected, actual);
    }

    public void isValidFalse() {
        String password = "ouiouioui";
        Password newPassword = new Password(password);
        boolean expected = false;
        boolean actual = newPassword.isValid();
        Assert.assertEquals(expected, actual);
    }
}