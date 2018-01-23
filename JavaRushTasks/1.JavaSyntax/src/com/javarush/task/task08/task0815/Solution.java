package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
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
        return  map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(String s : map.values()){
            if(s.equals(name)){
                count+=1;
            }
        }
         return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(String s : map.keySet()){
            if(s.equals(lastName)){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashMap <String, String> map = createMap ();
 //       System.out.println(getCountTheSameFirstName (map, "Петр" ));
  //     System.out.println(getCountTheSameLastName (map, "Толстой" ));


    }
}
