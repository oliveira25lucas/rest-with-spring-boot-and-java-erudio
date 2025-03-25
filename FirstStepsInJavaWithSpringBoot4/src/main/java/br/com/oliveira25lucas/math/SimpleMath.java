package br.com.oliveira25lucas.math;

import br.com.oliveira25lucas.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public Double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double div(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double media(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number){
        return Math.sqrt(number);
    }

}
