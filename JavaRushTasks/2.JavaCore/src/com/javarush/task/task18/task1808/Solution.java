package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
/*
Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        int size = file1.available(); // возвращает примерное количество доступных для чтения байтов
        int part1Size = size % 2 == 0 ? size / 2 : size / 2 + 1;
        while(file1.available()>0) {
            byte[] buf1 = new byte[part1Size];
            byte[] buf2 = new byte[size - part1Size];

            file1.read(buf1);
            file1.read(buf2);
            file2.write(buf1);
            file3.write(buf2);
        }
        file1.close();
        file2.close();
        file3.close();

    }
}
