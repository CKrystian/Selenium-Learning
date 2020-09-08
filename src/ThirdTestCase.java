import org.testng.annotations.*;

public class ThirdTestCase {


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

    @Test
    void test1()
    {
        System.out.println("Execute method test1");

    }
    @Test(enabled = false)
    void test2()
    {
        System.out.println("Execute method test2");
    }


}
