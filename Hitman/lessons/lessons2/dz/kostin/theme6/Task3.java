package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.Scanner;

public class Task3 {
	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * —оздать программу, котора€ будет выводить на экран меньшее по модулю
		 * из трЄх введЄнных пользователем вещественных чисел.
		 */

		sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.print("¬ведите целые числа:  ");
		sc = new Scanner(System.in);
		Math.abs(a);
		Math.abs(b);
		Math.abs(c);
		if (a > b & b > c & c < a) {
			System.out.println(c);
		} else if (a > b & b < c & c > a) {
			System.out.println(b);
		} else if (a < b & b > c & c > a) {
			System.out.println(a);
		} else if (a < b & b > c & c < a) {
			System.out.println(c);
		} else if (a < b & b < c & c > a) {
			System.out.println(a);
		} else if (a > b & b < c & c > b) {
			System.out.println(b);
		}
	}

}
