package tek.tdd.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;
public class SignUpPage extends SeleniumUtility {
    public SignUpPage(){
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "emailInput")
    public WebElement emailInput;

    @FindBy(id = "passwordInput")
    public WebElement passwordInput;

    @FindBy(id = "confirmPasswordInput")
    public WebElement confirmPasswordInput;

    @FindBy(id = "signupBtn")
    public WebElement signUpBtn;

    @FindBy(className = "error")
    public WebElement existingEmailErrorMsg;

    @FindBy(id = "nameError")
    public WebElement nameErrorMsg;
    @FindBy(id = "emailError")
    public WebElement emailErrorMsg;
    @FindBy(id = "passwordError")
    public WebElement passwordErrorMsg;
    @FindBy(id = "confirmPasswordError")
    public WebElement confirmPasswordErrorMsg;

    public void fillUpCreateAccountForm(String name, String email, String password) {
        sendText(nameInput, name);
        sendText(emailInput, email);
        sendText(passwordInput, password);
        sendText(confirmPasswordInput, password);
        clickOnElement(signUpBtn);
    }
}
