package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f = new FileInputStream(reader.readLine());

        HashMap<Integer, Integer> mapOfByte = new HashMap<Integer, Integer>();

        int value = 0;
        Integer count = 0;
        while (f.available() > 0) {
            value = f.read();// метод читает один байт и возвращает его как результат.
            count = mapOfByte.get(value);
            if (count != null)
                count++;
            else
                count = 0;
            mapOfByte.put(value, count);
        }

        f.close();
        /*
        Из-за этой строчки:
        int max = Collections.max(mapOfByte.values());
        Валидатором не принимается, показывая странные ошибки:
        - Для чтения из файла используй поток FileInputStream.
        - В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
        - Поток чтения из файла должен быть закрыт.
        Хотя условия выполненны, используется FileInputStream, поток закрыт ранее, и данные через пробел...
        Пришлось городить велосипед, по поиску max
        */

        //Находим максимальное число повторений
        boolean first = true;
        int min = 0;
        for (int amountByte : mapOfByte.values()) {
            if (first) {
                min = amountByte;
                first = false;
            }
            if (min > amountByte)
                min = amountByte;
        }

        //Выводим
        for (Map.Entry pair : mapOfByte.entrySet()) {
            if (min == (int) pair.getValue())
                System.out.print(" " + pair.getKey());
        }

    }
}
