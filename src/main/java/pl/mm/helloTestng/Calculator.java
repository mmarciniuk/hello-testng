package pl.mm.helloTestng;

public class Calculator {

    public double addition(double... numbers) {
        double result = 0;

        for(double number : numbers) {
            result += number;
        }

        return result;
    }

    public double subtraction(double... numbers) {
        return 0;
    }

    public double multiplication(double... numbers) {
        return 0;
    }

    public double division(double... numbers) {
        return 0;
    }

}
