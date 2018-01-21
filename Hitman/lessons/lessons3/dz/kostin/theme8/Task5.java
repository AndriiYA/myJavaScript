package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5]
		 * каждый, выведите массивы на экран в двух отдельных строках.
		 * Посчитайте среднее арифметическое элементов каждого массива и
		 * сообщите, для какого из массивов это значение оказалось больше (либо
		 * сообщите, что их средние арифметические равны).
		 */

		int[] array = new int[5], array2 = new int[5];
		int a, a2;
		double b, b2;
		a = 0;
		a2 = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 6);// 1 - массив
			array2[i] = (int) Math.floor(Math.random() * 6);// 2 - массив
															// generiryem
															// clychainie chisla
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); // 1 massiv zapolnenie
		}
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " "); // 2 massiv zapolnenie
		}
		for (int i = 0; i < array.length; i++) {
			a = a + array[i];
		}

		for (int i = 0; i < array2.length; i++) {
			a2 = a2 + array2[i];
		}
		System.out.println();

		b = (double) a / 5;
		b2 = (double) a2 / 5;
		if (b > b2) {
			System.out.println("1>2");
		} else if (b < b2) {
			System.out.println("1<2");
		} else {
			System.out.println("1=2");

		}
	}

}
