package ua.Kharkov.Hitman.lesson8.matrix;

public class Matrix {

	/*
	 * ����� ������ ����� ��������� ����: 1) ��������� ������ ������������
	 * �����; 2) ���������� ����� � �������� � �������. ����� ������ �����
	 * ��������� ������: 1) �������� � ������ ��������; 2) ��������� �� �����;
	 * 3) ��������� �� ������ �������; 4) ����������������; 5) ����� �� ������.
	 */
	public final static int DEFAULT_VALUE = 3;
	private double[][] array;

	public Matrix() {
		this(DEFAULT_VALUE, DEFAULT_VALUE);
	}

	public Matrix(int row, int column) {
		this.array = new double[row][column];
	}

	/**
	 * ����� �������� ���� ������
	 * 
	 * @param m
	 */
	public void summa(Matrix m) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++)
				array[row][column] += m.array[row][column];
		}
	}

	/**
	 * ����� ��������� ������� �� �����
	 * 
	 * @param number
	 *            - ����� �� ������� ���������� ��������� �������
	 */
	public void multiply(int number) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] *= number;
			}
		}
	}

	/**
	 * ����� ���������������� �������
	 */
	public void transponirovanie() {
		double[][] rezult = new double[array[0].length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				rezult[j][i] = array[i][j];
		}
		array = rezult;
	}

	/**
	 * ����� ������ ��� ������������� ������� � ���� ������, ��������� ���
	 * ������ ������ �� �����.
	 */
	public String toString() {
		String rezalt = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				rezalt += array[i][j] + "; ";
			}
			rezalt += "\n";
		}
		return rezalt;
	}

	/**
	 * ����� ������ �� �����
	 */
	public void print() {
		System.out.println(this);
	}

	/**
	 * ����� ���������� ������� ���������� �������
	 * 
	 * @param number
	 *            �������� ����������
	 */
	public void rand(int number) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] += Math.ceil(Math.random() * number);
			}
		}
	}

	/**
	 * ����� ���������� �������
	 */
	public void rand() {
		this.rand(100);
	}
}
