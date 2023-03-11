package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public final char ADDITION = '+';

    @Test
    @DisplayName("Testing addition")
    void testCalculatorAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = ADDITION;
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculatorSub() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 0;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculatorMulti() {
        int firstOperand = 3;
        int secondOperand = 2;
        char operator = MULTIPLICATION;
        int expected = 6;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculatorDiv() {
        int firstOperand = 4;
        int secondOperand = 2;
        char operator = DIVISION;
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
}
