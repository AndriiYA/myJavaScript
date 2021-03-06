package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнен 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "A");
        labels.put(1.1, "B");
        labels.put(1.2, "C");
        labels.put(1.3, "D");
        labels.put(1.4, "E");
    }

    public static void main(String[] args) {

        System.out.println(labels);

    }
}
