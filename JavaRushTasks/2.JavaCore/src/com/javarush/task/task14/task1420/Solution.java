package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int chi1 = Integer.parseInt(reader.readLine());
            int chi2 = Integer.parseInt(reader.readLine());
            if (chi1 <= 0 || chi2 <= 0) throw new Exception();
        int a, b, r;
        if (chi1 > chi2) {
            a = chi1;
            b = chi2;
        } else {
            b = chi1;
            a = chi2;
        }
        if (b == 0)
            System.out.println(a);
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);
        System.out.println(a);

    }
}
