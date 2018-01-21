package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme5;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Создать программу, выводящую на экран случайно сгенерированное
		 * трёхзначное натуральное число и его наибольшую цифру. Примеры работы
		 * программы: В числе 208 наибольшая цифра 8 В числе 774 наибольшая
		 * цифра 7 В числе 613 наибольшая цифра 6
		 */

		int a = 100;
		int b = 999;
		int c = (int) (Math.random() * (b - a) + a);
		int maximum = 0;
		int m;
		System.out.print(" в числе " + c + " ");
		do {
			m = c % 10;
			if (m > maximum)
				maximum = m;
			c = c / 10;
		} while (m > 0);
		System.out.println("наибольшая цифра " + maximum);

	}
}
