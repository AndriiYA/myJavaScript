package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        int num = Integer.parseInt(str);
        int num2 = Integer.parseInt(str1);
        int num3 = Integer.parseInt(str2);
        if (num == num2 && num != num3) {
            System.out.println(num + " " + num2);
        } else if(num2 == num3 && num2 != num){
            System.out.println(num2 + " " + num3 );
        }else if(num == num3 && num!=num2){
            System.out.println(num + " " + num3);
        }else if (num == num2 && num == num3 && num2 == num3){
            System.out.println(num + " "+ num2 + " "+ num3);
        }
    }
}