package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.javarush.task.task15.task1525.Statics.FILE_NAME;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();


    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));
            while (reader.ready()) {
                String s = reader.readLine();
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File "+ FILE_NAME+" not found!");
        } catch (IOException e) {
            System.out.println("ERROR: File "+ FILE_NAME+" can't read!");
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
