package com.javarush.task.task18.task1820;

/* 
Округление чисел
Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<String>();
// Читаем файл
        try {
            BufferedReader fileF = new BufferedReader(new FileReader(reader.readLine()));
            while(fileF.ready())
                list.add(fileF.readLine());
            fileF.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
// Парсим и округляем
        ArrayList<Long> values = new ArrayList<Long>();
        for(String i : list){
            for(String part:i.split(" ")){
                double a  = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }
// Записываем во второй файл
        try {
            FileWriter fileS = new FileWriter(reader.readLine());
            for(Long value : values)
                fileS.write(value.toString() + " ");
        fileS.close();
        } catch (IOException e) {
            e.printStackTrace();
            }



///Users/andriii/Downloads
    }
}
