package playground;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class Activity1 {
    /*
    * Write a test that navigate to Facebok.com
    * and print title
    */
        /*
    Write a test that navigate to Facebook.com
    and print Title
     */
    private WebDriver driver;
    @BeforeMethod
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void testFacebookTitle() {
        String applicationTitle = driver.getTitle();
        Assert.assertEquals(applicationTitle, "Facebook - log in or sign up");
    }
    @AfterMethod
    public void cleanupTest() {
        driver.quit();
    }
}



   /* @Test
    public void toFaceboook(){
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }*/

