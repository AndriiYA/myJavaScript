package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] arr = s.toCharArray();
        if(arr[0]!=' ')
            arr[0] = Character.toUpperCase(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] == ' ')
                arr[i] = Character.toUpperCase(arr[i]);
        }
        s = new String(arr);
        System.out.println(s);
    }
}

