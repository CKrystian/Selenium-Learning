package brokenlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.net.URL;

public class brokenLinksCheck {

    String homePage = "http://www.zlti.com";
    String currentURL = "";
    HttpURLConnection huc = null;
    int repCode = 200;
    WebDriver driver;


    @BeforeClass
    void setupSelenium()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krystian\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = "http://www.zlti.com";
        driver.get(homePage);


    }
    @Test(priority = 1)
    public void brokenLinks()
    {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Iterator<WebElement> it = links.iterator();
        while (it.hasNext())
        {
            currentURL = it.next().getAttribute("href");
            System.out.println(currentURL);
            if(currentURL == null || currentURL.isEmpty())
            {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            if(!currentURL.startsWith(homePage))
            {
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            try{
                huc = (HttpURLConnection)(new URL(currentURL).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                repCode = huc.getResponseCode();
                if (repCode >= 400)
                {
                    System.out.println(currentURL+ " is broken");
                }
                else
                {
                    System.out.println(currentURL+ " is valid link");
                }
            }
           catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    @AfterClass
    public void driverQuit()
    {
      //  driver.quit();
    }
}
