package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
		 * Определите какой элемент является в этом массиве максимальным и
		 * сообщите (Не понятно!!!) -
		 * "индекс его последнего вхождения в массив".
		 */

		int mas[] = new int[12];
		int max = mas[0], min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.floor(Math.random() * 31 - 15);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "; ");
		}
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i])
				max = mas[i];
			if (min > mas[i])
				min = mas[i];

		}
		System.out.println("kolichestvo chicel v massive - " + mas.length);
		System.out.println("Max: " + max);
		System.out.println("Min:" + min);

	}

}
