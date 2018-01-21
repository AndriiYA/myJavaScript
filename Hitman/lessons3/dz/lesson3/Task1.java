package ua.Kharkov.Hitman.lessons3.dz.lesson3;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Вывести массив в обратном порядке.
		 */

		int[] m = new int[] { 9, 3, 7, 4, 2 };
		for (int i = m.length - 1; i >= 0; i--) {
			System.out.println((m[i]));
		}

	}
}
