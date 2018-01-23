package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
    ArrayList<String>list = new ArrayList<String>();
    list.add(0,"A");
    //list.add(10, "B");
        list.add(0,"B");
        System.out.println(list.size());
    for(int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
    }
    }
}
