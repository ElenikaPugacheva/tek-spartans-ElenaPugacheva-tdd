package tek.tdd.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.utility.DataGenerator;
public class CreateNewAccountTest extends UIBaseClass {
/*
    CreateAccountTest
    Story 4: Navigate to Create Account page and Create new Account
    Validate New Account Created.
    */
@Test
public void createNewAccountTestPositive() {
    clickOnElement(homePage.signInLink);
    clickOnElement(signInPage.createNewAccountBtn);
    String expectedEmail = DataGenerator.generateRandomEmail("elenav");
    signUpPage.fillUpCreateAccountForm("Elena",
            expectedEmail,
            "Mona3yo#");
    String actualEmail = getElementText(accountPage.accountEmailTitle);
    Assert.assertEquals(actualEmail, expectedEmail,
            "Profile Page should have same email as Created");
    }
    /*Story Addition.
    Story 4.1
    Navigate to Create Account page and Create new Account
    With existing email and validate error message "this email is already exist, please use another email address".
    */
@Test
    public void createNewAccountWithExistingEmailTest(){
    clickOnElement(homePage.signInLink);
    clickOnElement(signInPage.createNewAccountBtn);
    String existingEmail = "elenavin5@gmail.com";
    signUpPage.fillUpCreateAccountForm("Elena", existingEmail, "Mona3yo#");
    String actualErrorMessage = getElementText(signUpPage.existingEmailErrorMsg);
    Assert.assertEquals(actualErrorMessage,
            "this email is already exist, please use another email address",
            "Error message should match when using an existing email.");
}
    /*Activity:
    Story# 4.2
    Navigate to Create new Account page and click sign up button without filling the form
    Validate all errors on all fields.
    */
    @Test
    public void clickOnSignUpBtnWithoutFillingFields(){
        clickOnElement(homePage.signInLink);
        clickOnElement(signInPage.createNewAccountBtn);
        clickOnElement(signUpPage.signUpBtn);
        String nameError = getElementText(signUpPage.nameErrorMsg);
        String emailError = getElementText(signUpPage.emailErrorMsg);
        String passwordError = getElementText(signUpPage.passwordErrorMsg);
        String confirmPasswordError = getElementText(signUpPage.confirmPasswordErrorMsg);

        Assert.assertEquals(nameError, "Name is a required field", "Name field error message should be displayed.");
        Assert.assertEquals(emailError, "Email is a required field", "Email field error message should be displayed.");
        Assert.assertEquals(passwordError, "Password is a required field", "Password field error message should be displayed.");
        Assert.assertEquals(confirmPasswordError, "Confirm Password is a required field", "Confirm Password field error message should be displayed.");
    }
}