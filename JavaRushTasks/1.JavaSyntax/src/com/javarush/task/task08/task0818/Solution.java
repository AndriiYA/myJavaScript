package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Иванов", 100);
        map.put("Иванидзе", 1000);
        map.put("Иваник", 3000);
        map.put("Петров", 4000);
        map.put("Сидоров", 5000);
        map.put("Прутков", 111);
        map.put("Толстой", 3222);
        map.put("Тонкий", 4222);
        map.put("Пушкин", 5666);
        map.put("Кукушкин", 7777);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if(value.compareTo(500)== -1){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

     //           HashMap<String, Integer> hm =  createMap();
     //  removeItemFromMap (hm);

     // for (Map.Entry <String, Integer> pair : hm.entrySet())
       //  System.out.println(pair.getKey()+" "+pair.getValue());
    }
}