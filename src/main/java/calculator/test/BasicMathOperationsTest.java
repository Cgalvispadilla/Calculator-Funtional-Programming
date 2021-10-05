package calculator.test;

import static calculator.BasicMathOperations.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathOperationsTest {
    @Test
    @DisplayName("esta prueba valida el funcionamiento de la suma")
    void validarFuncionamientoDeSuma(){
        //assert
        double numberOne=15;
        double numberTwo=30;
        double result=45;

        //act
        var res= sum(numberOne,numberTwo);

        //assert
        Assertions.assertEquals(result,res);
    }
    @Test
    @DisplayName("esta prueba valida el funcionamiento de la resta")
    void validarFuncionamientoDeResta(){
        //assert
        double numberOne=5;
        double nomberTwo=3;
        double result=2;

        //act
        var res= substraction(5,3);

        //assert
        Assertions.assertEquals(result,res);
    }
    @Test
    @DisplayName("esta prueba valida el funcionamiento correcto de la multiplicación")
    void validarFuncionamientoCorrectoDeLaMultiplicacion(){
        //assert
        double multiplicand=5;
        double multiplier=5;
        double result=25;

        //act
        var res= multiply(multiplicand,multiplier);

        //assert
        Assertions.assertEquals(result,res);
    }
    @Test
    @DisplayName("esta prueba valida el funcionamiento correcto de la multiplicación por cero")
    void validarElFuncionamientoCorrectoDeLaMultiplicacionPorCero(){
        //assert
        double multiplicand=5;
        double multiplier=0;
        double result=0;

        //act
        var res= multiply(multiplicand,multiplier);

        //assert
        Assertions.assertEquals(result,res);
    }
    @Test
    @DisplayName("esta prueba valida el funcionamiento correcto de la división entera")
    void validarElFuncionamientoCorrectoDeLaDivisionEntera(){
        //assert
        double dividend=25;
        double divider=5;
        double result=5;

        //act
        var res= division(dividend,divider);

        //assert
        Assertions.assertEquals(result,res);
    }
    @Test
    @DisplayName("esta prueba valida el funcionamiento correcto de la división por cero")
    void validarElFuncionamientoCorrectoDeLaDivisionPorCero(){
        //assert
        double dividend=5;
        double divider=0;
        double result=-1;

        //act
        var res= division(dividend,divider);

        //assert
        Assertions.assertEquals(result,res);
    }
    @Test
    @DisplayName("esta prueba valida el funcionamiento correcto de la división en un número negativo")
    void validarElFuncionamientoCorrectoDeLaDivisionEnNumeroNegativo(){
        //assert
        double dividend=25;
        double divider=-5;
        double result=-1;

        //act
        var res= division(dividend,divider);

        //assert
        Assertions.assertEquals(result,res);
    }
}