package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year<=0 || month>12 || month<1){
            System.out.println("invalid date");
        }else {
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("31 days");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("30 days");
                    break;
                case 2:
                    if (isLeap(year)){
                        System.out.println("29 days");
                    }else System.out.println("28 days");
                    break;
            }
        }
    }

    boolean isLeap(int w){
        if (w % 4 == 0 && w % 100 != 0 || w % 400 == 0){
            return true;
        }else return false;
    }

}
