package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task18 {

	/**
	 * DEFAULT_LENGTH - длина по умолчанию константа
	 */
	public final static int DEFAULT_LENGTH = 10;

	/**
	 * массив который может расти
	 */
	private int[] array;

	/**
	 * длинна массива
	 */
	private int size;

	//  онструктор без параметров
	public Task18() {
		this(DEFAULT_LENGTH);
	}

	// конструктор с параметрами
	public Task18(int length) {
		this.array = new int[length];
	}

	/**
	 * метод отчистки всего массива
	 * 
	 * @return пустой массив
	 */
	public void clean() {
		this.size = 0;
	}

	/**
	 * метод дл€ добовлени€ в массив элемента
	 * 
	 * @param number
	 *            - элемент который нужно добавить
	 */
	public void add(int number) {
		if (size == array.length) {
			increase();
		}
		this.array[size] = number;
		this.size++;
	}

	/**
	 * метод дл€ добавлени€ в массив элемента, в заданый индекс
	 * 
	 * @param index
	 *            - индекс в оторый нужно добавить
	 * @param number
	 *            - элемент который нужно добавить
	 */
	public void add(int index, int number) {
		if (size == array.length) {
			increase();
		}
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = number;
		size++;
	}
	// public void add(int index, int number) {
		// if (size == array.length) {
		// array [size] = array[array.length+ 1];
		// for (int i = 0; i < array.length; i++) {
		// if (i < index) {
		// array[i] = array[index];
		// } else {
		// array[i + 1] = array[index];
		// }
		// }
		// }
		// array[index] = number;
		// size++;
		// }

	/**
	 * метод увеличени€ внутреннего массива
	 */
	private void increase() {
		int[] mas = new int[array.length + DEFAULT_LENGTH];
		for (int i = 0; i < array.length; i++) {
			mas[i] = array[i];
			mas[i + 1] = array[i];
		}
		array = mas;
	}

	/**
	 * метод служит дл€ представлени€ объекта в виде строки. “ребуетс€ дл€
	 * вывода строки на экран.
	 */
	public String toString() {
		String rezalt = "[";
		for (int i = 0; i < size; i++) {
			rezalt += array[i] + " ";
		}
		return rezalt + "]";
	}

	/**
	 * метод вывода на экран
	 */
	public void print() {
		System.out.println(Task18.this);

	}
}
