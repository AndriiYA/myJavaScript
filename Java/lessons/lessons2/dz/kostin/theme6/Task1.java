package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.Scanner; // Импортируем класс

public class Task1 {
	private static Scanner sc;

	public static void main(String[] args) {

		/*
		 * Создать программу, которая будет сообщать, является ли целое число,
		 * введённое пользователем, чётным или нечётным. Если пользователь
		 * введёт не целое число, то сообщать ему об ошибке.
		 */

		sc = new Scanner(System.in);
		int i = 2;
		System.out.print("Введите целое число: ");
		if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно
								// считать целое число
			i = sc.nextInt(); // считывает целое число с потока ввода и
								// сохраняем в переменную
			if (i % 2 == 0)
				System.out.println("chetnoe");
			else
				System.out.println(" ne chetnoe");
		} else {
			System.out.println("Вы ввели не целое число");
		}

	}

}
