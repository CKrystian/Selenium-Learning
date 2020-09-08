import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Selenium2 {


    WebDriver driver;
    @Test
    @Parameters("browser")

    public void setup(String browserName) throws Exception {


        if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Krystian\\geckodriver.exe");
            driver = new FirefoxDriver();

        }
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krystian\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else {
            throw new Exception("Browser is not correct");
        }

        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();

        //driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
        //driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");
        //driver.findElement(By.id("login")).click();
        //driver.wait(100000);
        driver.quit();





        // WebDriver driver;
        //  @Test
        //@Parameters("browser")








            /*
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");


            WebDriver ffDriver = new FirefoxDriver();
            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.testarena.pl/zaloguj");
            ffDriver.get("http://demo.testarena.pl/zaloguj");
            driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
            ffDriver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
            driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");
            ffDriver.findElement(By.id("password")).sendKeys("sumXQQ72$L");
            driver.findElement(By.id("login")).click();
            ffDriver.findElement(By.id("login")).click();

            System.out.println("Poprawne logowanie");
            driver.wait(100000);
            ffDriver.wait(100000);
            driver.quit();
            ffDriver.quit();*/
    }
}
