import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class GuruTutorial {
    WebDriver driver;
    String baseURL = "";

    @BeforeClass

    public void setupSelenium()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krystian\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //String baseURL = "http://demo.guru99.com/test/radio.html";
       // String baseURL = "http://demo.guru99.com/test/link.html";



    }
    @Test(priority = 1)
    public void firstCase() {

        /*String pageTitle = "";
        pageTitle = driver.getTitle();
        Assert.assertEquals("Welcome: Mercury Tours", pageTitle,"Page title is matched");

        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();

        String alertMessage = "";
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMessage);


        WebElement textbox_username = driver.findElement(By.name("firstName"));
        WebElement textbox_password = driver.findElement(By.name("lastName"));
        if (textbox_username.isDisplayed())
        {
            textbox_username.sendKeys("tutorial");
        }
        if (textbox_password.isDisplayed())
        {
            textbox_password.sendKeys("tutorial");
        }

        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements: " + elements.size()); */

        /*for (int i=0; i< elements.size(); i++)
        {
            System.out.println("Radio button text: " + elements.get(i).getAttribute("value"));
        }

        WebElement email = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.name("passwd"));
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        email.sendKeys("user");
        pass.sendKeys("test");


        System.out.println("Form was successfully filled");
        login.click();

         */
        /*List<WebElement> elements = driver.findElements(By.name("webform"));

        WebElement option1 = elements.get(1);
        option1.click();

        for (int i=0;i<elements.size();i++)
        {
            if (elements.get(i).isSelected())
            {
                System.out.println("Checkbox and radio value: " + elements.get(i).getAttribute("value") + " : is selected");
            }
            else{
                System.out.println("Checkbox and radio value: " + elements.get(i).getAttribute("value") + " : is not selected");
            }
        }

        driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a")).click();
        if (driver.getTitle().equals("Facebook"))
        {
            System.out.println("We are at Facebook Page");
        }
        else {
            System.out.println("We are not in FB Page");
        }
        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByIndex(1);
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("First Selected Option: " + selectedOption.getText());

        */
       /* List<WebElement> links = driver.findElements(By.tagName("a"));
        int dupa = links.size();
        System.out.println("Rozmiar: " + dupa);

        System.out.println("First Element: " + links.get(0).getAttribute("href"));


       for (int i=0;i<links.size();i++)
        {

                System.out.println("Link to: " + links.get(i).getAttribute("href"));
        }

        Actions builder = new Actions(driver);
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));

        */

        // email.sendKeys("email@test.pl");
        //password.sendKeys("zaq12wsxcde3");
        //driver.findElement(By.cssSelector("[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
       /* Actions builder = new Actions(driver);
        WebElement input = driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\Krystian\\Desktop\\new.txt");
        WebElement terms = driver.findElement(By.id("terms"));
        WebElement submit = driver.findElement(By.id("submitbutton"));

        Action seriesOfAction = builder.moveToElement(terms).click().moveToElement(submit).click().build();

        seriesOfAction.perform();*/
    }
        @Test(priority = 2)
        public void secondCase()
        {

            baseURL = "http://demo.guru99.com/test/delete_customer.php";
            driver.get(baseURL);

            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("13");
            driver.findElement(By.xpath("//input[@type='submit']")).click();

            Alert alert = driver.switchTo().alert();
            String alertMessage= driver.switchTo().alert().getText();
            System.out.println(alertMessage);
            alert.accept();





        }
        @Test(priority = 3)
        public void thirdCase()
        {
            baseURL = "http://demo.guru99.com/popup.php";
            driver.get(baseURL);
            /*
            Pierwszy przypadek testowy [AA]:
            1. Przejdź na stronę do zamawiania produktu
            2. Wybierz klienta
            3. Wybierz sposób płatności
            4. Wybierz produkt
            5. Wpisz domenę
            6. Zapłać


            Drugi przypadek testowy:
            1. Przejdź na strone zamawiania produktu
            2. Wybierz klienta
            3. Wybierz sposób płatności
            4. Wybierz produkt
            5. Zapłać

            Trzeci przypadek testowy:
            1. Przejdź na stronę do zamawiania produktu
            2. Wybierz klienta
            3. Wybierz sposób płatności
            4. Wybierz produkt
            6. Dodaj do produktu rejestracje/transfer domeny
            7. Wpisz domene
            8. Wybierz okres ważności domeny
            9. Zapłać

            Odpalać na chrome i firefox
             */

        }









    @AfterClass
    public void quitDriver()
    {
       //driver.quit();
    }
}

