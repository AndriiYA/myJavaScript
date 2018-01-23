package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {


    public static void main(String[] args) {

            int number = 10;
            int rezult = 1;
            for (int i = 1; i <= number; i++) {
                rezult = rezult * i;
            }
            System.out.println(rezult);
        }

    }
