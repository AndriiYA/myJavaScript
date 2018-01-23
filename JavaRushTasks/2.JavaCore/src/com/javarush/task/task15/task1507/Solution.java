package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {

        printMatrix(2, 3, "8");
        //System.out.println(printMatrix(3));
    }

    public static void printMatrix(int m, int n, String value) {     //1
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {      //2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static int printMatrix(int n, int m) {               //3
        return n * m;
    }

    public static void printMatrix() {                            //4
        System.out.println("Что-то по умолчанию");
    }

    public static Double printMatrix(double n, double m) {      //5
        return n + m;
    }

    public static String printMatrix(byte n, byte m) {           //6
        n = (byte) (n + m);
        m = (byte) (n - m);
        n = (byte) (n - m);
        return n + " " + m;
    }

    public static void printMatrix(int[][] matrix) {             //7
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
    public static int printMatrix(int n, int m, int k){        //8
        return n * m * k;
    }
    public static int printMatrix(int n){                     //9
    if(n == 1){
        return 1;
    }else{
        return n * printMatrix(n -1);
    }
 }

 public static Object printMatrix(Object o){                  //10
        return o.hashCode();
 }


}




