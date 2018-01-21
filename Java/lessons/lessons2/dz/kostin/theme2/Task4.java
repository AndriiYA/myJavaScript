package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme2;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * В переменной n хранится натуральное трёхзначное число. Создайте
		 * программу, вычисляющую и выводящую на экран сумму цифр числа n.
		 */
		int n = 345;
		System.out.println((n / 100) + (n / 10) % 10 + (n % 10));
	}

}
