package ua.Kharkov.Hitman.lesson8.vektor;

public class Vektor<T> {

	/**
	 * DEFAULT_LENGTH - ����� �� ��������� ���������
	 */
	public final static Integer DEFAULT_LENGTH = 10;

	/**
	 * ������ ������� ����� �����
	 */
	private T[] array;

	/**
	 * ������ �������
	 */
	private int size;

	// ����������� ��� ����������
	public Vektor() {
		this(DEFAULT_LENGTH);
	}

	// ����������� � �����������
	@SuppressWarnings("unchecked")
	public Vektor(int length) {
		this.array = (T[]) new Object[length];
	}

	/**
	 * ����� �������� ����� �������
	 * 
	 * @return ������ ������
	 */
	public void clean() {
		this.size = 0;
	}

	/**
	 * ����� ��� ���������� � ������ ��������
	 * 
	 * @param number
	 *            - ������� ������� ����� ��������
	 */
	public void add(T number) {
		if (size == array.length) {
			increase();
		}
		this.array[size] = number;
		this.size++;
	}

	/**
	 * ����� ��� ���������� � ������ ��������, � ������� ������
	 * 
	 * @param index
	 *            - ������ � ������ ����� ��������
	 * @param number
	 *            - ������� ������� ����� ��������
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
	 * ����� ��� ��������� j-�� �������� � �������
	 * 
	 * @param index
	 *            - ������ � ������� ������� ���������� ��������
	 * @return - ������ � ������� ������� ���������� ��������
	 */
	public T get(int index) {
		if (index < 0 || index >= size)
			throw new IncorrectIndexException();
		return array[index];
	}

	/**
	 * ����� ������ ��� �������� j-�� �������� � �������
	 * 
	 * @param index
	 *            - ������� � ������� ������� ���������� �������
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
	 * ����� ���������� ����������� �������
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
	 * ����� ������ ��� ������������� ������� � ���� ������. ��������� ���
	 * ������ ������ �� �����.
	 */
	public String toString() {
		String rezalt = "[";
		for (int i = 0; i < size; i++) {
			rezalt += array[i] + " ";
		}
		return rezalt + "]";
	}

	/**
	 * ����� ������ �� �����
	 */
	public void print() {
		System.out.println(Vektor.this);

	}
}
