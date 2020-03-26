package pl.mm.helloTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition_ShouldEndWithSuccess() {
        //given
        double number1 = 1, number2 = 2, expectedResult = 3;

        //when
        double result = calculator.addition(number1, number2);

        //then
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testSubtraction_ShouldEndWithSuccess() {
        //given
        double number1 = 1, number2 = 2, expectedResult = -1;

        //when
        double result = calculator.subtraction(number1, number2);

        //then
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testMultiplication_ShouldEndWithSuccess() {
        //given
        double number1 = 2, number2 = 2, expectedResult = 4;

        //when
        double result = calculator.multiplication(number1, number2);

        //then
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testDivision_ShouldEndWithSuccess() {
        //given
        double number1 = 8, number2 = 2, expectedResult = 4;

        //when
        double result = calculator.division(number1, number2);

        //then
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "testDataProvider", threadPoolSize = 2)
    public void testAddition_ShouldEndWithSuccess2(double number1, double number2, double expectedResult) {
        //when
        double result = calculator.addition(number1, number2);

        //then
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(parallel = true)
    public Object[][] testDataProvider() {
        return new Object[][] {
                {1, 2, 3},
                {26, 2020, 2046},
                {5, 10, 20}
        };
    }

}