package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        /*
Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
         */


            //Создаем поток-чтения-байт-из-файла "/Users/andriii/Downloads/JavaR.txt"
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int max = 0;
        if(inputStream.available() > 0)
            max = inputStream.read();
            while (inputStream.available() > 0){ //пока есть еще непрочитанные байты
            int value = inputStream.read();
            if(max  < value)
                max = value;
            }

        System.out.println(max);
            inputStream.close(); //закрываем поток
        }
    }

