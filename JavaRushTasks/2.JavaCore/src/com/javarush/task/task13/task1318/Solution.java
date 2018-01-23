package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        while (file.ready()) {
            System.out.println(file.readLine());
        }

        file.close();
        reader.close();

    }
}
///Users/andriii/Downloads