package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task5A {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("i" + i + "j" + j + " ");
			}
			System.out.println();
		}

		int[] array = { 0, 10, 20, 30, 40, 50 };
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}

		// ÑÎÐÒÈÐÎÂÊÀ ÏÓÇÛÐÜÊÎÌ

		// int[] arr = { 3, 7, 2, 8, 3, 4, 1 };
		// for (int i = arr.length - 1; i >= 0; i--) {
		// for (int index = 0; index < i; index++) {
		// if (arr[index] > arr[index + 1]) {
		// int tmp = arr[index];
		// arr[index] = arr[index + 1];
		// arr[index + 1] = tmp;
		// }
		// }
		// }
		// for (int index = 0; index < arr.length; index++) {
		// System.out.print(arr[index] + " ");
		// }
	}

}
