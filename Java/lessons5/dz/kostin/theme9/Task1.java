package ua.Kharkov.Hitman.lessons5.dz.kostin.theme9;

public class Task1 {

	/*
	 * 9.1. Создать статический метод, который будет иметь два целочисленных
	 * параметра a и b, и в качестве своего значения возвращать случайное целое
	 * число из отрезка [a;b]. C помощью данного метода заполнить массив из 20
	 * целых чисел и вывести его на экран.
	 */

	// Статический метод (Функция)
	public static int rand(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + (a));

	}

	/*
	 * 9.2. Создать метод, который будет выводить указанный массив на экран в
	 * строку. С помощью созданного метода и метода из предыдущей задачи
	 * заполнить 5 массивов из 10 элементов каждый случайными числами и вывести
	 * все 5 массивов на экран, каждый на отдельной строке.
	 */
	public static int rand2(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + (a));
	}

	// Метод процедура
	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 9.3. Создать метод, который будет сортировать указанный массив по
	 * возрастанию любым известным вам способом.
	 */
	public static void bubble(int[] array) {
		for (int i = 0; i < array.length; i++) {
		}
		for (int i = array.length - 1; i >= 0; i--) {
			for (int index = 0; index < i; index++) {
				if (array[index] > array[index + 1]) {
					int tmp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = tmp;
				}
			}
		}
	}
	/*
	 * 9.4. В массиве хранится 7 явно заданных текстовых строк. Создать
	 * программу, которая отсортирует и выведет на экран строки в алфавитном
	 * порядке. Например, если были даны такие строки: Пушкин, Лермонтов,
	 * Некрасов, Толстой, Л. Н. Толстой, А. Н. Есенин, Паустовский
	 */
	public static void sort(String [] array){
		for (int i=0; i<array.length-1; i++){
			for (int j=i+1; j<array.length; j++){
				if (array[i].compareTo(array[j])>0){
					String tmp = array[i];
					array[i]=array[j];
					array[j]=tmp;
				}
			}
		}
	}
}
