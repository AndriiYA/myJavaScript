package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task15 {
	public static void main(String[] args) {
		/*
		 * Заполнение массива числами от 0 до 19 (5 столбцов и 4 строки)
		 */

//		int mas[][] = new int[4][5];
//		int k = 0;
//		for (int i = 0; i < mas.length; i++)
//			for (int j = 0; j < mas[i].length; j++) {
//				mas[i][j] = k;
//				k++;
//			}
//		for (int i = 0; i < mas.length; i++) {
//			for (int j = 0; j < mas[i].length; j++)
//				System.out.print(mas[i][j] + " ");
//			System.out.println();
//
//		}

		// int n = 6;
		// int m = 3;
		// int[][] matr = new int[n][];
		// int[][] rezalt = new int[m][];
		//
		// for (int i = 0; i < rezalt.length; i++)
		// rezalt[i] = new int[n]; // n=3;
		// System.out.println("Matrix: ");
		//
		// for (int i = 0; i < matr.length; i++) {
		// matr[i] = new int[m];
		// for (int j = 0; j < matr[i].length; j++) {
		// matr[i][j] = (int) Math.round(Math.random() * 100);
		// System.out.print(matr[i][j] + " ");
		// }
		// System.out.println();
		// }
		// for (int i = 0; i < rezalt.length; i++) {
		// for (int j = 0; j < rezalt[i].length; j++) {
		// rezalt[i][j] = matr[j][i];
		//
		// }
		// }
		// System.out.println("Rezult: ");
		// for (int i = 0; i < rezalt.length; i++) {
		// for (int j = 0; j < rezalt[i].length; j++) {
		// System.out.print(rezalt[i][j] + " ");
		// }
		// System.out.println();
		// }
		
		
		 /**
	     * 2.3
	     * Создать двумерный массив символов! и заполнить его буквами Ч и Б в
	     * шахматном порядке.
	     */
	        int[][] array = new int[8][8];
	        for (int i = 0; i < array.length; i++) {
	            int[] sub = array[i];
	            for (int j = 0; j < sub.length; j++) {
	                if ((i + j) % 2 == 0) {
	                    array[i][j] = 1;
	                }
	            }
	        }
	        // красиво отображаем результат
	        for (int i = 0; i < array.length; i++) {
	            int[] is = array[i];
	            for (int j = 0; j < is.length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        
	    }

	}

