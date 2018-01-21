package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы
		 * массива на экран сначала в строку, отдел€€ один элемент от другого
		 * пробелом, а затем в столбик (отдел€€ один элемент от другого началом
		 * новой строки). ѕеред созданием массива подумайте, какого он будет
		 * размера.
		 * 
		 * 2 2 4 6 Е 20 4 6 Е 18 20
		 */

		int[] array = new int[10];
		for (int i = 0, n = 2; i < array.length; n = n + 2, i++) {
			array[i] = n;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
