package ua.Kharkov.Hitman.lessons3.dz.lesson3;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Найти максимальный элемент в массиве.
		 */
		int[] m = new int[] { 1, 3, 7, 4, -2 };
		int max = m[0], min = m[0];
		for (int i = 0; i < m.length; i++) {
			if (max < m[i])
				max = m[i];
			if (min > m[i])
				min = m[i];

		}
		System.out.println("kolichestvo chicel v massive - " + m.length);
		System.out.println("Max: " + max);
		System.out.println("Min:" + min);

	}

}
