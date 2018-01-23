package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

   min(3,5);
        min(123,234);
       min(2.3,5.7);
    }
    public static int min(int num, int num2){
        if(num>num2){
            return num2;
        }else
            return num;
    }
    public static long min(long num, long num2){
        if(num>num2){
            return num2;
        }else
            return num;
    }
    public static double min(double num, double num2){
        if(num>num2){
            return num2;
        }else
            return num;
    }

    //Напишите тут ваши методы
}
