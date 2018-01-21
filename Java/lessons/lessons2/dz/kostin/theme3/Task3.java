package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Натуральное положительное число записано в переменную n. Определить и
		 * вывести на экран, сколько цифр в числе n.
		 */

		int n = 3463;
		int m = (int) Math.ceil(Math.log10(n + 1));
		System.out.println(n + " имеет чисел : " + m);
	}

}
