import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExample {

    WebDriver driver;
    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krystian\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");


    }
    @Test(priority = 1)
    void test()
    {

        WebElement type = driver.findElement(By.linkText("Frames"));
        Assert.assertTrue(type.isDisplayed(),"Frames is not Displayed");
        //driver.findElement(By.linkText("iFrame")).click();
    }
    @Test(priority = 2)
    void homePageTest()
    {
        String title = driver.getTitle();
        Assert.assertEquals("The Internet2", title, "Title is not matched");
    }
    @AfterClass
    void closeDriver()
    {
        driver.quit();
    }
}
