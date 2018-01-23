package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double count = 0, sum = 0;
        double rest;
        while (true) {
            int number = Integer.parseInt(reader.readLine());

            if (number == -1) {
                rest = sum / count;
                System.out.println(rest);
                break;
            }
            sum+=number;
            count++;
        }
    }
}

