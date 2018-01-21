package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task7 {

	public static void main(String[] args) {
		// Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на
		// экран. Напоминаем, что первый и второй члены последовательности равны
		// единицам, а каждый следующий — сумме двух предыдущих.

		int a = 1, b = 1;
		int n = 18;
		System.out.print(a + " " + b);
		int[] mas = new int[18];
		for (int i = 0; i < n; i++) {
			mas[i] = a + b;
			a = b;
			b = mas[i];
			System.out.print(" " + mas[i]);
		}
	}

}
