package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("ArrayList " + getTimeMsOfInsert(new ArrayList()));
        System.out.println("LinkedList " + getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        //напишите тут ваш код

        Date start = new Date();
        insert10000(list);
        Date after = new Date();
        return start.getTime() - after.getTime();

        //напишите тут ваш код

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
