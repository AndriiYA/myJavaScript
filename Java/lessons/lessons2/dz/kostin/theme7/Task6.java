package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Не понятно!!! Выведите на экран все двузначные члены
		 * последовательности 2an-1+200, где a1= –166.
		 */

		for (int a = -166, i = 1; i < 100; a = 2 * a + 200, i++) {
			if (a < 100)
				if (a > -100)

					System.out.print(a + " ");
		}
	}

}
