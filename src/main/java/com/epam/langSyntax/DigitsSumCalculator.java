package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String s = String.valueOf(number);
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(result);
    }
}
