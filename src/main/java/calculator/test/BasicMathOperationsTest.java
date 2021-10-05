package calculator.test;

import static calculator.BasicMathOperations.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathOperationsTest {
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

}