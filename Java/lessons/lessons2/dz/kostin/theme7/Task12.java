package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		/*
		 * Для введённого пользователем с клавиатуры натурального числа
		 * посчитайте сумму всех его цифр (заранее не известно сколько цифр
		 * будет в числе).
		 */

		int a;
		int b = 0;
		System.out.print("Bвод натурального числа - ");

		Scanner scn = new Scanner(System.in);
		for (a = scn.nextInt(); a != 0; a /= 10) {
			b = b + (a % 10);
		}
		System.out.println(b + " ");
		scn.close();
	}

}
