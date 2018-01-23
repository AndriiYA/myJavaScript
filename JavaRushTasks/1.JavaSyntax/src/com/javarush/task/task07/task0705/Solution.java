package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int array [] = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int mas1 [] = new int[10];
        int mas2 [] = new int[10];
        for(int i = 0; i < mas1.length; i++){
            mas1[i] = array[i];
            mas2[i] = array[array.length/2 + i];
        }

        for(int i = 0; i < mas2.length; i++){
            System.out.println(mas2[i]);
        }
    }
}
