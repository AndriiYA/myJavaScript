package ua.Kharkov.Hitman.Date;

public class Task3 {
	public static void main(String[] args) {
		// Применение множественных операторов catch.
		try {
			int a = 1; // args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Деление на 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ошибка индекса массива: " + e);
		}
		System.out.println("После блока try/catch. ");

	}
}
