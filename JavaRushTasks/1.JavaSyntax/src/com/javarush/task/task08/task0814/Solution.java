package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 20; i++) {
           set.add(i);
        }
        return set;
    }

    // Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            //получение текущего элемента и переход на следующий
            Integer number = (Integer) iterator.next();
            if (number.compareTo(10)>0) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {


      removeAllNumbersMoreThan10(createSet());
    }

}
