package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

import java.util.Scanner;

public class Task11 {
	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * Пользователь должен указать с клавиатуры чётное положительное число,
		 * а программа должна создать массив указанного размера из случайных
		 * целых чисел из [-5;5] и вывести его на экран в строку. После этого
		 * программа должна определить и сообщить пользователю о том, сумма
		 * модулей какой половины массива больше: левой или правой, либо
		 * сообщить, что эти суммы модулей равны. Если пользователь введёт
		 * неподходящее число, то программа должна требовать повторного ввода до
		 * тех пор, пока не будет указано корректное значение.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		int left = 0, right = 0;

		sc = new Scanner(System.in);
		do {
			System.out.print("Введите целые числа: ");
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				if (a > 0 && a % 2 == 0) {
					int mas[] = new int[a];

					for (int i = 0; i < mas.length; i++) {

						mas[i] = (int) (Math.random() * 11 - 5);
						System.out.print(mas[i] + " ");
					}
					b = mas.length / 2;
					for (int i = 0; i < b; i++) {
						left = left + Math.abs(mas[i]);
					}
					for (int i = b; i < mas.length; i++) {
						right = right + Math.abs(mas[i]);
					}
					if (left < right) {
						System.out.print("Правая часть больше");
					} else if (left > right) {
						System.out.print("Левая часть больше");
					} else {
						System.out.print("Равны");
					}
				}
			}

		} while (a <= 0 || a % 2 != 0);

	}
}
