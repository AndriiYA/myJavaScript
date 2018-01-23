package com.javarush.task.task18.task1818;

/* 
Два в одном
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream file1 = new FileOutputStream(reader.readLine(), true);
        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());

        /*
.available() не блокирует поток выполнения при отсутствии данных , а .read() - блокирует.
.available() возвращает примерное количество доступных для чтения байтов, а .read(byte[] b) - количество считанныхв буфер (массив байтов), от -1 при достижении конца потока данных и до размера массива (b.length).
.available() лишь проверяет наличие данных, а .read() - их считывает.
         */
        while(file2.available() > 0){
            byte[]buf = new byte[file2.available()];
            file2.read(buf);
            file1.write(buf);
        }
        file2.close();

        while (file3.available()>0){
            byte[]buf = new byte[file3.available()];
            file3.read(buf);
            file1.write(buf);
        }
        file3.close();
        file1.close();
    }
}
// /Users/andriii/Downloads//JavaR.txt