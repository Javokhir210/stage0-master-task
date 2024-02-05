package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Division by zero");
        }else {
            int temporary = dividend / divider;
            if (dividend==temporary*divider){
                System.out.println("Can be divided completely");
            }else System.out.println("Cannot be divided completely");
        }
    }

}
