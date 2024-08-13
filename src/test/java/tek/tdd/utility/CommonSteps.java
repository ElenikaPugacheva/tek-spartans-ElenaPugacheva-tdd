package tek.tdd.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.tdd.base.UIBaseClass;
public class CommonSteps extends UIBaseClass {
    public void updateFieldValue(String fieldName, String value) {
        String fieldXpath = String.format("//input[@name='%s']", fieldName);
        WebElement field = getDriver().findElement(By.xpath(fieldXpath));
        sendText(field, value);
    }
}
