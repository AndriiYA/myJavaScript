package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task11 {
	public static void main(String[] args) {
		/*
		 * Выведите на экран первые 11 членов последовательности Фибоначчи.
		 * Напоминаем, что первый и второй члены последовательности равны
		 * единицам, а каждый следующий — сумме двух предыдущих. int n = 11; int
		 * a = 1, b = 1; System.out.print(a + " " + b); int c = 2, i = 2;
		 * while(i < n) { c = a + b; a = b; b = c; System.out.print(" " + c);
		 * i++; }
		 */
		int a = 1, b = 1;
		int n = 11;
		System.out.print(a + " " + b);
		int c;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
	}

}
