package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task13 {

	public static void main(String[] args) {
		/*
		 * Сумма всех чисел в массиве
		 */

		int myArray[] = { 3, 5, 7, 12 };
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}
		System.out.println(sum);
	}

}
