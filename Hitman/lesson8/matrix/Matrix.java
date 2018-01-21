package ua.Kharkov.Hitman.lesson8.matrix;

public class Matrix {

	/*
	 * Класс должен иметь следующие поля: 1) двумерный массив вещественных
	 * чисел; 2) количество строк и столбцов в матрице. Класс должен иметь
	 * следующие методы: 1) сложение с другой матрицей; 2) умножение на число;
	 * 3) умножение на другую матрицу; 4) транспонирование; 5) вывод на печать.
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
	 * метод сложения двух матриц
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
	 * метод умножения матрицы на число
	 * 
	 * @param number
	 *            - число на которое происходит умножение матрицы
	 */
	public void multiply(int number) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] *= number;
			}
		}
	}

	/**
	 * метод транспонирования матрицы
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
	 * метод служит для представления объекта в виде строки, требуется для
	 * вывода строки на экран.
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
	 * метод вывода на экран
	 */
	public void print() {
		System.out.println(this);
	}

	/**
	 * метод заполнения матрицы случайными числами
	 * 
	 * @param number
	 *            диапозон заполнения
	 */
	public void rand(int number) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] += Math.ceil(Math.random() * number);
			}
		}
	}

	/**
	 * метод заполнения матрицы
	 */
	public void rand() {
		this.rand(100);
	}
}
