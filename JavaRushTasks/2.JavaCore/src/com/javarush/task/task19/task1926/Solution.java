package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

/*
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все символы из файла в обратном порядке.
 */
public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            reader.close();
            while(fileReader.ready()){
                StringBuffer str = new StringBuffer(fileReader.readLine());
                System.out.println(str.reverse());
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
///Users/andriii/Downloads



        }
    }

