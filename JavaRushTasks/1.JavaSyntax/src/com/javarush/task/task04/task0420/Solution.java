package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int array [] = {num1,num2,num3};
        for (int i = array.length - 1; i >=0; i--){
            for (int index = 0; index < i; index++){
                if(array[index] < array[index+ 1]){
                    int tmp = array[index];
                    array[index] = array[index+1];
                    array[index+1] = tmp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
