package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * В переменные a и b записаны целые числа, при этом b больше a.
		 * Создайте программу, которая будет генерировать и выводить на экран
		 * целое псевдослучайное число из отрезка [a;b].
		 */
		int a = 5;
		int b = 8;
		System.out.println("Вещественное псевдослучайное число" + ":"
				+ (Math.random() * (b - a) + a));
	}

}
