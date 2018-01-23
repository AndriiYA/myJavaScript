package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int s, summ=0, i=0;
        String word = "пусто";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            word = in.readLine();
            if (word.equals("сумма"))
                break;
            if (checkString(word) == false) {
                System.out.println("введите число или слово \"сумма\"");
                continue;
            }
            s = Integer.parseInt(word);
            summ += s;
        }
        System.out.println(summ);
    }
    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;

    }
}
