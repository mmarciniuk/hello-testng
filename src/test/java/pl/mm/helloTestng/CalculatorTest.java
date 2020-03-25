package pl.mm.helloTestng;

import org.testng.Assert;
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

}