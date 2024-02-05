package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int ans=0;
        while (number>0) {
            ans += number % 10;
            number /= 10;
        }
        System.out.println(ans);
    }

}
