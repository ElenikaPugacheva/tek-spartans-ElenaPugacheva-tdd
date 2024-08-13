package tek.tdd.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;
public class AccountPage extends SeleniumUtility {

    public AccountPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "account__information-email")
    public WebElement accountEmailTitle;
    @FindBy(id = "nameInput")
    public WebElement accountNameInput;
    @FindBy(id = "personalPhoneInput")
    public WebElement accountPhoneInput;
    @FindBy(id = "personalUpdateBtn")
    public WebElement updatePersonalInfoBtn;
    @FindBy(className = "Toastify__toast-body")
    public WebElement successToastMessage;

    public void updateAccountInformation(String name, String phone) {
        sendText(accountNameInput, name);
        sendText(accountPhoneInput, phone);
        clickOnElement(updatePersonalInfoBtn);
    }
    public String getAccountName() {
        return accountNameInput.getAttribute("value");
    }
    public String getAccountPhone() {
        return accountPhoneInput.getAttribute("value");
    }
}