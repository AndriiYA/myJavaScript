package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int number = 10;
            int rezult = 1;
            System.out.println(rezult);
            for (int i = 2; i <= number; i++) {
                rezult = rezult + i;
                System.out.println(rezult);
            }

        }
    }

