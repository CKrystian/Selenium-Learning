import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class parametrizationTest {

    WebDriver driver;
    String baseURL = "";

    @Test
    @BeforeClass
    void setupSelenium()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krystian\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }



}
