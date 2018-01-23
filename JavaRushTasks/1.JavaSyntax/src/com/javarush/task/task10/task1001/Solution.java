package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;   //  b = 46
        byte c = (byte) (a * b); // c = 0
        double f = (char) 1234.15; //f = 1234.0
        long d = (int) (a + f / c + b);
        System.out.println(d);
    }
}
