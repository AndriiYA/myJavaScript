package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map =new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Иванидзе", "Иван");
        map.put("Иваник", "Петр");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Прутков", "Кузьма");
        map.put("Толстой", "Алексей");
        map.put("Тонкий", "Лев");
        map.put("Пушкин", "Михаил");
        map.put("Кукушкин", "Сергей");

        return map;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
        }




    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
     /*
       HashMap<String, String> hm =  createMap();
       removeTheFirstNameDuplicates (hm);

       for (Map.Entry <String,String> pair : hm.entrySet())
           System.out.println(pair.getKey()+" "+pair.getValue());
    */
    }
}
