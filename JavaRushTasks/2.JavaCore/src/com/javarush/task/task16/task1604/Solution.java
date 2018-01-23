package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
    /*
    Требования:
1. Добавь в класс Solution публичный статический класс SpecialThread.
2. Класс SpecialThread не должен быть унаследован от какого-либо дополнительного класса.
3. Класс SpecialThread должен реализовывать интерфейс Runnable.
4. Метод run класса SpecialThread должен выводить свой стек-трейс.
     */
    public static class SpecialThread implements Runnable{
        @Override
        public void run() {
            for(StackTraceElement element : Thread.currentThread().getStackTrace()){
                System.out.println(element);
            }
        }
    }




}
