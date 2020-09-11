package parametrization;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class dataProvider {

    @DataProvider(name = "dataProviderTest")
    public static Object[][] getDataProviderSet(Method m) {
        if (m.getName().equalsIgnoreCase("testCase2")) {
            return new Object[][]{
                    {"Krystian", "Andrzej"},
                    {"Dupa", "KFC"},
                    {"Ola", "Kot"},
                    {"Ola", "Pies"}
            };
        } else
            {

            return new Object[][]{
                    {"Antionio", "aaa"},
                    {"Las", "bbbb"},
                    {"Vegas", "cccc"},
                    {"Parano", "dddd"}
            };

        }


    }
}
