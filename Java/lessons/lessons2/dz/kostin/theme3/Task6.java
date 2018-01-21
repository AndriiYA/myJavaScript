package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Натуральное положительное число записано в переменную n. Создайте
		 * программу, которая будет генерировать и выводить на экран целое
		 * псевдослучайное число из отрезка [-n;n].
		 */
		int n = 5;
		System.out.println("Вещественное псевдослучайное число n " + ":"
				+ (Math.random() * ((n * 2) + 1) - n));

	}

}
