package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {

    readData();
}

    public static void readData() {
        //напишите тут ваш код
        int save = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list = new ArrayList<Integer>();
        try {
            while(true) {
                int number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        } catch (Exception io) {
            for(Integer i: list)
                System.out.println(i);
        }

    }
}