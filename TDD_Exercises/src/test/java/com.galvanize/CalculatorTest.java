package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();



    @BeforeEach
    public void setUp() {this.calculator = new Calculator();
    }

 @Test
    public void testAddStringNumbers() {
//     String number2 = "6";
//     String number1 = "7";
     assertEquals(15, calculator.addStrings("5\n","5","5"));
 }

 @Test
 public void testResultInZero() {
     assertEquals(0, calculator.resultInZero(" "));
 }

 @Test
    public void testNegativeNumbers() {
    assertEquals("negatives not allowed: -5", calculator.negativeNumbers("-5", "2"));
}
}