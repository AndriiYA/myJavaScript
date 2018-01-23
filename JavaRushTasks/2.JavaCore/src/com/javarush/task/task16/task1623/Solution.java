package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{  //1. Измени класс GenerateThread так, чтобы он стал нитью.
        /*
        2. Создай конструктор GenerateThread, который должен:
        2.3. Номер первой нити должен начинается с 1.
             */
    public GenerateThread(){
        super(String.valueOf(++countCreatedThreads)); //2.1. Вызвать конструктор суперкласса с параметром String - номером созданной нити. Используй countCreatedThreads.
        start(); //2.2. Запустить текущую нить.
    }

    /*
    6. Если количество созданных нитей меньше Solution.count, метод run должен создать новую нить типа GenerateThread.
7. Если количество созданных нитей меньше Solution.count, метод run должен вывести созданную нить в консоль.
8. Вывод программы должен соответствовать заданию, показывать, что все 15 нитей были созданы.
     */
        @Override
        public void run() {
            super.run();
            if(countCreatedThreads < count){
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return getName() + " created";
        }


    }
}
