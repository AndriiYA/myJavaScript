package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int array[] = new int[15];
        int sum1 = 0;
        int sum2 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int even_sum = 0;
        int odd_sum = 0;
        for (int i=0;i<array.length;i++) {
            if ((i % 2) ==0)
                even_sum += array[i];
            else
                odd_sum += array[i];
        }

        if (even_sum>odd_sum)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
