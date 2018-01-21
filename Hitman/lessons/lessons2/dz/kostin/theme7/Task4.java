package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * —оздайте программу, вывод€щую на экран первые 20 элементов
		 * последовательности 2 4 8 16 32 64 128 Е.
		 */
		for (int a = 2; a <= Math.pow(2, 20); a = a * 2) {
			System.out.print(a + " ");
		}
	}

}
