package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int day = Integer.parseInt(s);
        String dayString;
        switch (day) {
            case 1:  dayString = "понедельник";
            System.out.println(dayString);
                break;
            case 2:  dayString = "вторник";
                System.out.println(dayString);
                break;
            case 3:  dayString = "среда";
                System.out.println(dayString);
                break;
            case 4:  dayString = "четверг";
                System.out.println(dayString);
                break;
            case 5:  dayString = "пятница";
                System.out.println(dayString);
                break;
            case 6:  dayString = "суббота";
                System.out.println(dayString);
                break;
            case 7:  dayString = "воскресенье";
                System.out.println(dayString);
                break;
            default: dayString = "такого дня недели не существует";
            System.out.println(dayString);
                break;
        }
    }
}