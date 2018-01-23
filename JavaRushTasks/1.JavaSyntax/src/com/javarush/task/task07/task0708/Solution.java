package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        Scanner sc = new Scanner(System.in);

        int str_max_len = 0;
        String tmp;
        int tmp_len;

        for (int i=0; i<5;i++) {
            tmp = sc.nextLine();
            tmp_len = tmp.length();

            if (tmp_len > str_max_len)
                str_max_len = tmp_len;

            strings.add(tmp);
        }

        for (int i= 0; i<strings.size();i++) {
            if (strings.get(i).length() == str_max_len)
                System.out.println(strings.get(i));
        }
    }
}

