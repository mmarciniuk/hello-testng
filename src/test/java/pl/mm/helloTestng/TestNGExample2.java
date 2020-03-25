package pl.mm.helloTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExample2 {

    @Test(dataProvider = "testDataProvider")
    public void testWithDataProvider(int testData) {
        System.out.println("Test run " + testData);
    }

    @Test(dataProvider = "testDataProvider2")
    public void testWithDataProvider2(String message, int testData) {
        System.out.println(message + testData);
    }

    @DataProvider
    public Object[][] testDataProvider() {
        return new Object[][]{
                {1}, {2}, {3}
        };
    }

    @DataProvider
    public Object[][] testDataProvider2() {
        return new Object[][] {
                {"Test run ", 1},
                {"Test run ", 2},
                {"Test run ", 3}
        };
    }

}
