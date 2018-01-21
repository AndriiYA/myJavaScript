package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Создайте массив из 8 случайных целых чисел из отрезка [1;10].
		 * Выведите массив на экран в строку. Замените каждый элемент с нечётным
		 * индексом на ноль. Снова выведете массив на экран на отдельной строке.
		 */

		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 10 + 1); // генерируем
																	// случайные
																	// числа
																	// от[1;10]в
																	// массив
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "  "); // Заполнение массива случайно
													// сгенерированіми числами
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {

				array[i] = 0;
			}
			System.out.print(array[i] + " ");

		}

	}

}
