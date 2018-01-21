package ua.Kharkov.Hitman.lesson8.vektor;

public class Vektor<T> {

	/**
	 * DEFAULT_LENGTH - длина по умолчанию константа
	 */
	public final static Integer DEFAULT_LENGTH = 10;

	/**
	 * массив который может расти
	 */
	private T[] array;

	/**
	 * длинна массива
	 */
	private int size;

	//  онструктор без параметров
	public Vektor() {
		this(DEFAULT_LENGTH);
	}

	// конструктор с параметрами
	@SuppressWarnings("unchecked")
	public Vektor(int length) {
		this.array = (T[]) new Object[length];
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
	public void add(T number) {
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
	public void add(int index, T number) {
		if (index < 0 || index > array.length)
			throw new IncorrectIndexException();
		if (size == array.length) {
			increase();
		}
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = number;
		size++;
	}

	/**
	 * метод дл€ получени€ j-го элемента в массиве
	 * 
	 * @param index
	 *            - индекс в массиве который необходимо получить
	 * @return - индекс в массиве который необходимо получить
	 */
	public T get(int index) {
		if (index < 0 || index >= size)
			throw new IncorrectIndexException();
		return array[index];
	}

	/**
	 * метод служит дл€ удалени€ j-го Їлемента в массиве
	 * 
	 * @param index
	 *            - элемент в массиве который необходимо удалить
	 */
	public void remove(int index) {
		if (index < 0 || index > array.length)
			throw new IncorrectIndexException();
		for (Integer i = index; i < size; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	/**
	 * метод увеличени€ внутреннего массива
	 */
	private void increase() {
		@SuppressWarnings("unchecked")
		T[] mas = (T[]) new Object[array.length + DEFAULT_LENGTH];
		for (Integer i = 0; i < array.length; i++) {
			mas[i] = array[i];
			
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
		System.out.println(Vektor.this);

	}
}
