package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class parametrizationTest {

    WebDriver driver;
    String baseURL = "";

    @Test

    void setupSelenium()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krystian\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseURL = "google.com";
        driver.get("https://google.com");
    }
  //  @Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
    //@Parameters({"author", "searchKey"})
    @Test(dataProvider="dataProviderTest", dataProviderClass = dataProvider.class)
    void testCase1( String author, String searchKey) throws InterruptedException {


        WebElement searchTab = driver.findElement(By.name("q"));
        searchTab.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+ searchTab.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //AssertJUnit.assertTrue(searchTab.getAttribute("value").equalsIgnoreCase(searchKey));
        searchTab.clear();

    }
    @Test(dataProvider="dataProviderTest", dataProviderClass = dataProvider.class)
    void testCase2(String author, String searchKey) throws InterruptedException
    {
        WebElement searchTab = driver.findElement(By.name("q"));
        searchTab.sendKeys(searchKey);
        System.out.println( author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+ searchTab.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //AssertJUnit.assertTrue(searchTab.getAttribute("value").equalsIgnoreCase(searchKey));
        searchTab.clear();
    }

    @Test
    void quitDriver()
    {
       // driver.quit();

    }



}
