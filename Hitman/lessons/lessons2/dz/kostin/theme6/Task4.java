package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Создать программу, которая будет проверять, является ли слово из пяти
		 * букв, введённое пользователем, палиндромом (примеры: «комок»,
		 * «ротор»). Если введено слово не из 5 букв, то сообщать об ошибке.
		 * Программа должна нормально обрабатывать слово, даже если в нём
		 * использованы символы разного регистра. Например, слова «Комок» или
		 * «РОТОР» следует также считать палиндромами.
		 */

		System.out.println("Vvedite slovo iz piati bykv: ");
		@SuppressWarnings("resource")
		// созд. объект класса сканер
		Scanner scn = new Scanner(System.in);
		// считыв. послед. символов + возвращаем длину строки количество
		// символов
		String a = scn.nextLine().toLowerCase();
		// Проверка слово из 5 букв ?
		if (a.length() == 5) {
		} else
			System.out.println("Vi vveli slovo ne iz 5 bykv");
		// проверка полиндром или нет
		if (a.charAt(0) == a.charAt(4) & a.charAt(1) == a.charAt(3)) {
			System.out.println("Slovo palindrom");
		} else {
			System.out.println("slovo ne palindrom");
		}
	}
}
