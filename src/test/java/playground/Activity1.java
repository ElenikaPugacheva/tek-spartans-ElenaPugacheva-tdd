package playground;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Activity1 {
    /*
    * Write a test that navigate to Facebok.com
    * and print title
    */
    @Test
    public void toFaceboook(){
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
