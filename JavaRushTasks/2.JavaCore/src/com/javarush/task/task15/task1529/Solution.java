package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
В классе Solution должен быть реализован статический метод reset.
5. Метод reset должен считывать строку с клавиатуры.
6. Если введенная строка равна "helicopter", в переменную result должен быть сохранен объект типа Helicopter.
7. Если введенная строка равна "plane", в переменную result должен быть сохранен объект типа Plane.
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут

            Solution.reset();

    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
            if (str.equals("helicopter")) {
                result = new Helicopter();
            }
            if (str.equals("plane")) {
                result = new Plane(10);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
