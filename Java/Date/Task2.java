package ua.Kharkov.Hitman.Date;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		
		// Обработка исключений с продолжением работы
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		for (int i = 0; i < 32000; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				System.out.println("Деление на ноль.");
				a = 0;// Присвоить ноль и продолжить работу
			}
			System.out.println("a: " + a);
		}
	}

}
