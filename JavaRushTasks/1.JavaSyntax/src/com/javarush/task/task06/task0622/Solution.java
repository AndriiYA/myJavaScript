package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());
        int mas [] = {num1, num2, num3, num4, num5};
        for(int i = mas.length - 1; i >= 0; i--){
            for(int j = 0; j<i; j++){
                if(mas[j] > mas[j+1]){
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i] + " ");
        }

        //напишите тут ваш код
    }
}
