package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task18 {

	/**
	 * DEFAULT_LENGTH - ����� �� ��������� ���������
	 */
	public final static int DEFAULT_LENGTH = 10;

	/**
	 * ������ ������� ����� �����
	 */
	private int[] array;

	/**
	 * ������ �������
	 */
	private int size;

	// ����������� ��� ����������
	public Task18() {
		this(DEFAULT_LENGTH);
	}

	// ����������� � �����������
	public Task18(int length) {
		this.array = new int[length];
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
	public void add(int number) {
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
	 * ����� ���������� ����������� �������
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
		System.out.println(Task18.this);

	}
}
