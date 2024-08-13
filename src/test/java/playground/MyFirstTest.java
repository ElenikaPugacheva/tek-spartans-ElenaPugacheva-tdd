package playground;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MyFirstTest {
    @BeforeTest
    public void runBeforeTest(){
        System.out.println("This is before each test");
    }
    @Test
    public void myFirstTestMethod(){
        System.out.println("Hello World");
    }
    @Test
    public void mySecondTestMethod(){
        System.out.println("This is my second test");
    }
    @AfterTest
    public void runAfterTest(){
        System.out.println("This is running After each test");
    }
}
