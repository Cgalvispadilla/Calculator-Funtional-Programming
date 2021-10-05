package calculator;

import static calculator.BasicMathOperations.*;

public class main {
    public static void main(String[] args) {

        double numero1 = 2;
        double numero2 = 0;

        System.out.println("resultado suma: " +sum(numero1,numero2));
        System.out.println("resultado resta: " +substraction(numero1,numero2));
        System.out.println("resultado división entera "+division(numero1,numero2));
        System.out.println("resultado multiplicación: " + multiply(numero1,numero2));

    }
}
