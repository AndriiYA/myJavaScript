package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/


public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        String monthString;
        switch (month) {
            case 1:  monthString = "зима";
            System.out.println(monthString);
                break;
            case 2:  monthString = "зима";
                System.out.println(monthString);
                break;
            case 3:  monthString = "весна";
                System.out.println(monthString);
                break;
            case 4:  monthString = "весна";
                System.out.println(monthString);
                break;
            case 5:  monthString = "весна";
                System.out.println(monthString);
                break;
            case 6:  monthString = "лето";
                System.out.println(monthString);
                break;
            case 7:  monthString = "лето";
                System.out.println(monthString);
                break;
            case 8:  monthString = "лето";
                System.out.println(monthString);
                break;
            case 9:  monthString = "осень";
                System.out.println(monthString);
                break;
            case 10: monthString = "осень";
                System.out.println(monthString);
                break;
            case 11: monthString = "осень";
                System.out.println(monthString);
                break;
            case 12: monthString = "зима";
                System.out.println(monthString);
                break;
            default: monthString = "Не знаем такого";
            System.out.println(monthString);
                break;
        }

    }
}