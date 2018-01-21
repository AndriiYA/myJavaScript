package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task3A {

	public static void main(String[] args) {
		/*
		 * Cоздать двумерный массив из 7 строк по 4 столбца в каждой из
		 * случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
		 * Определить и вывести на экран индекс строки с наибольшим по модулю
		 * произведением элементов. Если таких строк несколько, то вывести
		 * индекс первой встретившейся из них.
		 */

		int[][] array = new int[7][4];
		int imax = 0, pmax = 0, p1 = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 12 - 6);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" |" + array[i][j] + "| ");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[j].length; j++) {
				p1 = p1 * array[i][j];
			}
			if (Math.abs(p1) > Math.abs(pmax)) {
				imax = i;
				pmax = p1;
			}
			System.out.println(i + " " + p1);
			p1 = 1;
		}
		System.out.println("\n");
		System.out.println("Naiboljshij indeks: " + imax);
	}
}
