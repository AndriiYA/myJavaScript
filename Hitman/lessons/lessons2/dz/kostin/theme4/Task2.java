package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme4;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
		 * записанных в переменные m и n. Например, среди чисел 8,5 и 11,45
		 * ближайшее к десяти 11,45. (Math.abs - modyl chisla!!!)
		 */

		double m, n, a, b, d;
		m = -10;
		n = 30;
		d = 10;
		a = Math.abs(m - d);
		b = Math.abs(n - d);
		if (a < b) {
			System.out.println(m + " blizje");
		} else if (a > b) {
			System.out.println(n + " blizje");
		} else {
			System.out.println("Rastoyanije ot " + m
					+ " do 10 = rasstoyanijy ot " + n + " do 10");
		}
	}
}
