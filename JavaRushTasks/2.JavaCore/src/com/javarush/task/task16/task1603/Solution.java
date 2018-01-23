package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
1. В методе main создай 5 объектов типа SpecialThread.
2. В методе main создай 5 объектов типа Thread.
3. Добавь 5 разных нитей в список list.
4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);


    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread d = new SpecialThread();
        SpecialThread d1 = new SpecialThread();
        SpecialThread d2 = new SpecialThread();
        SpecialThread d3 = new SpecialThread();
        SpecialThread d4 = new SpecialThread();
        list.add(new Thread(d));
       list.add(new Thread(d1));
        list.add(new Thread(d2));
        list.add(new Thread(d3));
       list.add(new Thread(d4));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
