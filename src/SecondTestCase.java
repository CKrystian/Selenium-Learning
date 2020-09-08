import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTestCase {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("Method before class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("Method after class");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("Test before method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("Test after method");
    }

    @Test(priority = 1)

    void login()
    {
        System.out.println("Login to system test");
    }
    @Test(priority = 3)
    void search()
    {
        System.out.println("Search Test");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 2)
    void addCustomer()
    {
        System.out.println("Add customer test");
    }


}
