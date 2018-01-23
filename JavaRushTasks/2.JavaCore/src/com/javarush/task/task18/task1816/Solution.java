package com.javarush.task.task18.task1816;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/* 
Английские буквы

1. Считывать с консоли ничего не нужно.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabetEng = "abcdefghijklmnopqrstuvwxyz";
        String alphabetEngUp = alphabetEng.toUpperCase();

        FileReader file = new FileReader(args[0]); //2. Создай поток чтения из файла, который приходит первым параметром в main.

        int count = 0;
        while (file.ready()){
            char str = (char) file.read();
            if((alphabetEng.indexOf(str) > -1 || alphabetEngUp.indexOf(str) > -1)) //4. Нужно учитывать заглавные и строчные буквы.
                count++; //3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
        }
        file.close(); //5. Поток чтения из файла должен быть закрыт.
        System.out.println(count);
    }
}
