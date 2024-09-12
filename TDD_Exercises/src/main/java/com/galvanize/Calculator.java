package com.galvanize;


public class Calculator {

    public int addStrings(String ...numbers){

        int sum = 0;
        for(String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }
        return sum;
    }

    public int resultInZero(String number){
        if (number == " ") {
        }
        return 0;
    }

    public String negativeNumbers(String... numbers) {
        StringBuilder result = new StringBuilder();

        for (String number : numbers) {
            if (number != null && !number.trim().isEmpty() && number.trim().charAt(0) == '-') {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(number);
            }
        }

        if (result.length() > 0) return "negatives not allowed: " + result;
        return "";
    }}



//int num2 = Integer.parseInt(number2);
