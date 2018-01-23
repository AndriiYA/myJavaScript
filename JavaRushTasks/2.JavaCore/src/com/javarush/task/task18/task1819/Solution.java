package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    static final int BUF_SIZE = 1024;
    public static void main(String[] args) throws IOException {
/*
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения и считай его содержимое.
3. Затем, для первого файла создай поток для записи. Для второго - для чтения.
4. Содержимое первого и второго файла нужно объединить в первом файле.
5. Сначала должно идти содержимое второго файла, затем содержимое первого.
6. Созданные для файлов потоки должны быть закрыты.
 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        fileToOut (out, fileName2);
         fileToOut(out, fileName1);
         FileOutputStream f = new FileOutputStream(fileName1);
         out.writeTo(f);
         f.close();
    }


    public static void fileToOut(ByteArrayOutputStream out, String fileName ) throws IOException{
        FileInputStream f = new FileInputStream(fileName);
        int readedByte = 0;
        while(f.available() > 0){
            byte[]buf = new byte[Solution.BUF_SIZE];
            readedByte = f.read(buf);
            out.write(buf, 0, readedByte);
        }
f.close();
    }

}
