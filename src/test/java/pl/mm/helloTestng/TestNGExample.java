package pl.mm.helloTestng;

import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNGExample {

    private final static String MSG = "Hello from the ";

    @BeforeSuite
    public void beforeSuite() {
        System.out.println(MSG + "@BeforeSuite");
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(MSG + "@BeforeTest");
        System.out.println("####################");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(MSG + "@BeforeClass");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(MSG + "@BeforeMethod");
        System.out.println("%%%%%%%%%%%%%%%%%%%%");
    }

    @BeforeMethod
    public void beforeMethodWithTestResult(ITestResult testResult) {
        System.out.println(MSG + "@BeforeMethod");
        System.out.println("With test result");
        System.out.println("%%%%%%%%%%%%%%%%%%%%");
        System.out.println(testResult.toString());
    }

    @Test
    public void testWithSuccess() {
        System.out.println(MSG + "@Test");
        System.out.println("Test with success");
    }

    @Test(expectedExceptions = {RuntimeException.class})
    public void testWithExpectedException() {
        System.out.println(MSG + "@Test");
        System.out.println("Test with expected exception/error");
        throw new RuntimeException("Expected exception");
    }

    @Test
    public void testWithUnexpectedException() {
        System.out.println(MSG + "@Test");
        System.out.println("Test with unexpected exception/error");
        throw new RuntimeException("Unexpected exception");
    }

    @AfterMethod
    public void afterMethodWithTestResult(ITestResult testResult) {
        System.out.println(testResult.toString());
        System.out.println("%%%%%%%%%%%%%%%%%%%%");
        System.out.println("With test result");
        System.out.println(MSG + "@AfterMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("%%%%%%%%%%%%%%%%%%%%");
        System.out.println(MSG + "@AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
        System.out.println(MSG + "@AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("####################");
        System.out.println(MSG + "@AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        System.out.println(MSG + "@AfterSuite");
    }

}
