package tek.tdd.tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
public class UpdateProfileInfo extends UIBaseClass {
    @Test
    public void updateAccountInfo(){
        clickOnElement((homePage.signInLink));
        signInPage.doSignIn("elenavin5@gmail.com","Mona3yo#");
        clickOnElement(homePage.accountLink);
        updateFieldValue(accountPage.accountNameInput, "Elena Vinyarskaya");
        updateFieldValue(accountPage.accountPhoneInput, "3477441988");
        clickOnElement(accountPage.updatePersonalInfoBtn);
        boolean isSuccessToastDisplayed = isElementDisplayed(accountPage.successToastMessage);
        Assert.assertTrue(isSuccessToastDisplayed, "Success toast message should be displayed after updating account information.");

        String updatedName = accountPage.getAccountName();
        String updatedPhone = accountPage.getAccountPhone();
        Assert.assertEquals(updatedName, "Elena Vinyarskaya", "Name should be updated to 'Elena Vinyarskaya'.");
        Assert.assertEquals(updatedPhone, "3477441988", "Phone number should be updated to '3477441988'.");
    }
    public void updateFieldValue(WebElement field, String value) {
        sendText(field, value);
    }
}