package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] array = new String[10];
        int [] mas = new int [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++){
            array[i] = reader.readLine();
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < mas.length; j++) {
                mas[i] = array[i].length();

            }
            System.out.println(mas[i]);
        }
    }
}
