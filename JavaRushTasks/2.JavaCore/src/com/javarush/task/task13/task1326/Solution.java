package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(reader.readLine()))));

            while (fileReader.ready()) {
                list.add(Integer.parseInt(fileReader.readLine()));
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Can't read File");
        }


       // /Users/andriii/Downloads/JavaR.txt

        Collections.sort(list);
        for (Integer i : list) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}
