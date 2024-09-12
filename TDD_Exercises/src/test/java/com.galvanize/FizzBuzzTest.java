package com.galvanize;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeEach
    public void setUp() {this.fizzBuzz = new FizzBuzz();
    }


//    If the number is divisible by 3, return the string "Fizz"
    @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz", fizzBuzz.divisibleBy3(15));
    }

//If the number is divisible by 5, return the string "Buzz"
    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz", fizzBuzz.divisibleBy5(20));
    }


//    If the number is divisible by both 3 and 5, return the string "FizzBuzz"
    @Test
    public void testDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.divisibleBy3And5(15));

    }

    //    Otherwise, return the number as a string
    @Test
public void testReturnNumberAsString() {
        assertEquals("12", FizzBuzz.returnNumberAsString(12));
    }
}