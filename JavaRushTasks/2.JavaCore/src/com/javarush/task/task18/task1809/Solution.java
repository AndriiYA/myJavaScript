package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());

        while(file.available()>0){
            byte[]buf = new byte[file.available()];
            byte[]revers = new byte[buf.length];
            file.read(buf);
            for(int i = buf.length-1; i>=0; i--)
                revers[buf.length - i - 1] = buf[i];
            file2.write(revers);
        }
        file.close();
        file2.close();
    }
}
   ///Users/andriii/Downloads/JavaR.txt