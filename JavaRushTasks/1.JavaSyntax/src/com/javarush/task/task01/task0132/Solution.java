package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));


    }


    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum;
        sum = number / 100;
        sum = sum + ((number / 10) % 10);
        sum = sum + ((number % 100) % 10);
        return sum;

    }
}