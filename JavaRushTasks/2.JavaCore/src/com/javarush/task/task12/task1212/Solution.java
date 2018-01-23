package com.javarush.task.task12.task1212;

/* 
«Исправь код», часть 1
*/

public class Solution {
    public static void main(String[] args) {

    }

    private static abstract class Pet {
        public static String getName() {

            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
