package calculator;

public class BasicMathOperations {

    public static double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double substraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }
    public static double multiply(double multiplicand, double multiplier) {
            return (multiplier == 1) ? multiplicand : (multiplier != 0)?sum(multiplicand, multiply(multiplicand, substraction(multiplier, 1))):0;
    }
    public static double division(double dividends, double divider) {
            double res = dividends;
            return res <= 0 ? 0 : (divider > 0)?1 + division(substraction(res, divider), divider):-1;
    }


}
