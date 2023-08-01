package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int quotient = dividend / divider;
        int result = quotient * divider;
        if(result == dividend){
            System.out.println("can be divided completely");
        }
        else{
            System.out.println("cannot be divided completely");
        }
    }
}
