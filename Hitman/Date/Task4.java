package ua.Kharkov.Hitman.Date;

public class Task4 {

	public static void main(String[] args) {
		// ѕример вложенных операторов try.
		try {
			int a = args.length;
			/*
			 * ≈сли не указаны параметры командной строки, следующий оперетор
			 * создаст исключение делени€ на нуль
			 */
			int b = 42 / a;
			System.out.println("a = " + a);
			try { // ¬ложенный блок try
				/*
				 * ≈сли используетс€ один аргумент командной строки, то
				 * исключение делени€ на ноль будет создано следующим кодом
				 */
				if (a == 1)
					a = a / (a - a); // ƒеление на ноль
				/*
				 * ≈сли используютс€ два аргумента командной строки, то
				 * создаетс€ исключение выхода за приделы массива.
				 */
				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99;// —оздаетс€ исключение выхода
								// за приделы массива
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("»ндекс за приделами массива: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("ƒеление на 0: " + e);
		}

	}

}
