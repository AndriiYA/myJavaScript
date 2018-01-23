package com.javarush.task.task15.task1510;

/* 
Все лишнее - прочь!
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);

        add((byte) 1, 2d);
    }
/*
1. В классе Solution должно быть реализовано три метода add.
2. Метод main не должен содержать вызов метода add с параметрами "1" и 2d.
 */
    public static void add(int i, int j) {

        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {

        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {

        System.out.println("Double addition");
    }
}
