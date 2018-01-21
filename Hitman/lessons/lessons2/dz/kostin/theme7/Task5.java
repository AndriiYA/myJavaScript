package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Не понятно!!! Выведите на экран все члены последовательности 2an-1–1,
		 * где a1=2, которые меньше 10000.
		 */
		for (int a = 2, i = 1; i < a; a = 2 * a - 1, i++) {
			if (a <= 10000) {
				System.out.print(a + " ");
			}
		}
	}
}
