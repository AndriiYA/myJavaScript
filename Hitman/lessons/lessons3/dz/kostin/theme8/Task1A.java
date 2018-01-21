package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task1A {

	public static void main(String[] args) {
		// 1.Создать двумерный массив из 8 строк по 5 столбцов в каждой из
		// случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
		/*
		 * int[][] da = new int[6][4]; for (int i = 0; i < da.length; i++) { for
		 * (int j = 0; j < da[i].length; j++) { da[i][j] = (int) (Math.random()
		 * * 10); } } for (int i = 0; i < da.length; i++) { for (int j = 0; j <
		 * da[i].length; j++) { System.out.print(da[i][j] + "\t"); }
		 * System.out.println(); // Переходим на следующую строку }
		 */

		int[][] array = new int[8][5];
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 89 + 10);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {

				if (max < array[i][j])
					max = array[i][j];
			}
		}
		System.out.println("максимальный элемент в массиве - " + max);
	}

}
