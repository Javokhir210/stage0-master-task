package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int ans =0;
        for (int i=1; i<=3; i++){
            ans += (int) (number%10 * Math.pow(10, 3-i));
            number /= 10;
        }
        System.out.println(ans);
    }

}
