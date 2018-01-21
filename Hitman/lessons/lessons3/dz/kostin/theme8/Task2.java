package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * —оздайте массив из всех нечЄтных чисел от 1 до 99, выведите его на
		 * экран в строку, а затем этот же массив выведите на экран тоже в
		 * строку, но в обратном пор€дке (99 97 95 93 Е 7 5 3 1).
		 */

		int[] array = new int[50];
		for (int i = 0, n = 1; i < array.length; n = n + 2, i++) {
			array[i] = n;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
