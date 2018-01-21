package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * В переменной n лежит некоторое вещественное число. Вычислить и
		 * вывести на экран значение функции «сигнум» от этого числа (-1, если
		 * число отрицательное; 0, если нулевое; 1 если, положительное).
		 */
		double n = 56;
		if (n < 0) {
			System.out.println(-1);
		} else if (n == 0) {
			System.out.println(0);
		} else if (n > 0) {
			System.out.println(1);
		}

	}
}
