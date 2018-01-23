package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str2 = reader.readLine();
        int number = Integer.parseInt(str);
        int number2 = Integer.parseInt(str2);
        if (number == number2) {
            System.out.println(number);
        }else if(number<number2){
                    System.out.println(number);
        }else if (number2<number){
            System.out.println(number2);
        }
    }
}