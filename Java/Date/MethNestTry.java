package ua.Kharkov.Hitman.Date;

/* ќператоры try могут быть не €вно вложены в вызовах методов. */

class MethNestTry {
	static void nesttry(int a) {
		try { // вложенный блок try
			/*
			 * ≈сли используетс€ один аргумент командной строки, то исключение
			 * делени€ на нуль. будет создано следующим кодом.
			 */
			if (a == 1)
				a = a / (a - a); // деление на ноль
			/*
			 * ≈сли используютс€ два аргумента командной строки, то создаетс€
			 * исключение выхода за приделы массива.
			 */
			if (a == 2) {
				int c[] = { 1 };
				c[42] = 99;// создаетс€ исключение выхода за
							// пределы массива
			}
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("»ндекс за приделами массива: " + e );
		} 
	}

	public static void main(String[] args) {
		try {
			int a = 2;
			/*
			 * ≈сли не указаны параметры командной строки, следующий оперетор
			 * создаст исключение делени€ на нуль
			 */
			int b = 42 / a;
			System.out.println("a = " + b);
			nesttry(a);
		} catch (ArithmeticException e) {
			System.out.println("ƒеление на 0: " + e);
		}
	}
}
