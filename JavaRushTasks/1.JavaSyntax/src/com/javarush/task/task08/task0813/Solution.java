package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> list = new HashSet<String>();
        for(int i = 0; i < 20; i++) {
            list.add("Л1" + i);
        }
        return list;
    }

    public static void main(String[] args) {

        createSet();
    }
}
