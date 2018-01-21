package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task17 {

	public static void main(String[] args) {

		int[] array = { 2, 3, 4, 5, 6, 7, 8 };
		int index = 3;
		int number = 789;
		int size = array.length;
		int[] mas = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			if (i < index) { // если текущий элемент меньше индекса вставки
				mas[i] = array[i]; // то просто копируем
			} else { // иначе копируем с сдвигом
				mas[i + 1] = array[i];
			}
		}
		mas[index] = number;
		array = mas;
		size++;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
