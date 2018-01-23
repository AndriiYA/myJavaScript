package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String number = reader.readLine();
        String number2 = reader.readLine();
        int num = Integer.parseInt(number);
        int num2 = Integer.parseInt(number2);

        System.out.println(name1 + " получает " + num + " через " + num2 +  " лет.");

    }
}
