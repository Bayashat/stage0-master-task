package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String s = String.valueOf(number);
        String s2 = "";
        for(int i = 0; i < s.length(); i++){
            s2 = s.charAt(i) + s2;
        }
        int result = Integer.parseInt(s2);
        System.out.println(result);
    }
}
