package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
		 * Выведите массив на экран. Подсчитайте сколько в массиве чётных
		 * элементов и выведете это количество на экран на отдельной строке.
		 */

		int[] ar1 = new int[15];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = (int) Math.floor(Math.random() * 9);
			System.out.print(ar1[i] + "  ");
			// }
			// for (int i = 0; i < ar1.length; i++) {
			// if (ar1[i] % 2 == 0) {
			// n++;
			// }
			// }
			// System.out.println();
			// System.out.println("<" + n + ">");
		}
	}

}
