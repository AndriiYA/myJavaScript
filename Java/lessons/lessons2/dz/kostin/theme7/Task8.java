package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * Выведите на экран все положительные делители натурального числа,
		 * введённого пользователем с клавиатуры.
		 */

		int n;
		int a = 0;
		System.out.print("Вводите ваше натуральное число - ");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt(); // возвращает истину если с потока вввода можно
							// считать число
		System.out.print("Число " + n + " делится на - ");
		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
				a++;
				System.out.print(i + " ");
			}
		}
		System.out.println("Количество делителей - " + a);

	}

}
