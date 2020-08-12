import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"sanity"})
    void test1()
    {
        System.out.println("Test number 1");
    }

    @Test(groups = {"sanity"})
    void test2()
    {
        System.out.println("Test number 1");
    }

    @Test(groups = {"regression"})
    void test3()
    {
        System.out.println("Test number 1");
    }

    @Test(groups = {"regression", "sanity"})
    void test4()
    {
        System.out.println("Test number 1");
    }



}
