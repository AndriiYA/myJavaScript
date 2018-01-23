package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> basic = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < 20; i++){
            basic.add(Integer.parseInt(reader.readLine()));
        }
        for(int i = 0 ; i < basic.size(); i++) {
            if(basic.get(i)%3 == 0 && basic.get(i)%2 ==0){
                one.add(basic.get(i));
                two.add(basic.get(i));
            }else if (basic.get(i)%3 == 0){
                one.add(basic.get(i));
            }else if(basic.get(i)%2 == 0){
                two.add(basic.get(i));
            }else{
                three.add(basic.get(i));
            }
        }
       printList(basic);
        printList(one);
        printList(two);
         printList(three);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list){
            System.out.println(x);
        }

    }
}
