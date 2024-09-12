package com.galvanize;

public class FizzBuzz {


    //    If the number is divisible by 3, return the string "Fizz"
    public static String divisibleBy3(int n) {
        if (n % 3 == 0) return "Fizz";
        return null;
    }

    //If the number is divisible by 5, return the string "Buzz"
    public static String divisibleBy5(int n) {
        if (n % 5 == 0) return "Buzz";
        else return "";
    }

    //If the number is divisible by both 3 and 5, return the string "FizzBuzz"
    public static String divisibleBy3And5(int n) {
        if ((n % 3 == 0) && (n % 5 == 0)) return "FizzBuzz";
        else return Integer.toString(n);
    }

    //Otherwise, return the number as a string
    public static String returnNumberAsString(int n) {
        return Integer.toString(n);
    }
}
