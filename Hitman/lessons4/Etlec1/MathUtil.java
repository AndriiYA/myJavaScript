package ua.Kharkov.Hitman.lessons4.Etlec1;

public class MathUtil<T> {

	/**
	 * ����� ������� ���������� ����� �������� ���� ����� ������������� �����
	 * 
	 * @param number
	 * @param number2
	 * @return ���������� ����� ��������
	 */
	public static int divider(int number, int number2) {
		while (number != number2)
			if (number > number2)
				number -= number2;
			else
				number2 -= number;

		return number;
	}

	/**
	 * ����� ������� ����� ���� ������������� ������ �����
	 * 
	 * @param number
	 *            - ������������ �����
	 * @return �����
	 */
	public static int calcDigits(int number) {
		int summa = 0;
		do
			summa += number % 10;

		while ((number /= 10) != 0);

		return summa;

	}

	/**
	 * ����� ��������� ������� �� ����� - (�.�. �� ������� ��� ������� �� ��
	 * ����� �����, ����� ���� � 1).
	 * 
	 * @param number
	 *            - ����� ��� ��������
	 * @return false/true
	 */
	public static boolean isSimple(int number) {
		int i;
		for (i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * ����� ������� ����� ���� 1! - 2! + 3! � 4! + 5! - � + n!
	 * 
	 * @param n
	 *            - ����� n > 0
	 * @return ����� ���� ����� n > 0
	 */
	public static int factorial (int n){
		int val = 1;
		for (int i =1; i<n; i++){
			val *= (i+1);
		}
		return val;
	}

	/**
	 * ����� ������������, ������� ������������ ���� ����� ������ ����� ����
	 * ������ � ���� ��������� ����
	 * 
	 * @return ���-�� ������ ���� ���� ������ � ���� ��������� ���� �
	 *         ������������ �����
	 */
	public static int mirror() {
		int count = 0;
		for (int i = 100000; i < 1000000; i++) {
			int left = i / 1000;
			int right = i % 1000;
			if (MathUtil.calcDigits(left) == MathUtil.calcDigits(right))
				count++;
		}
		return count;
	}

	/**
	 * ����� ��������� ������ ����� ����������: 1, 1, 2, 3, 5, 8, 13, 21, � �
	 * ���� ���� ������ ��������� ����� �������� ������ ���� ����������
	 * 
	 * @param arrayLength
	 *            - ������ �������
	 * @return ��� ���������
	 */
	public static int[] fibonachi(int arraylength) {
		int[] mas = new int[arraylength];
		mas[0] = 1;
		mas[1] = 1;
		for (int i = 2; i < mas.length; i++) {
			mas[i] = mas[i - 1] + mas[i - 2];
		}
		return mas;
	}

	/**
	 * ����� ��������� ������ �������� �������
	 * 
	 * @param arrayLength
	 *            - ������ �������
	 * @return ������ ������� �����
	 */
	public static int[] arrayPrimeNumbers(int arrayLength) {
		int[] array = new int[arrayLength];
		int size = 0;
		int number = 2;
		while (true) {
			if (MathUtil.isSimple(number)) {
				array[size] = number;
				size++;
				if (size == arrayLength) {
					break;
				}
			}
			number++;
		}
		return array;
	}

	/**
	 * ����� ��������� ��������� ������ ������� � � � � ��������� �������
	 * 
	 * @param size
	 *            ���-�� �����
	 * @param number2
	 *            ���-�� ��������
	 * @return
	 */
	public static char[][] chessArray(int size) {
		char[][] array = new char[size][size];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i + j) % 2 == 0) {
					array[i][j] = '�';
				} else {
					array[i][j] = '�';
				}
			}
		}
		return array;
	}

	/**
	 * ����� �������� ��-�� ����� ������� ����������� ��� ����������
	 * ������������ ������� ������� ����� ��� �������� � ������ ���������
	 * 
	 * @param size
	 *            - �������� ������� � ������ ���������
	 * @return ���-�� �����
	 */
	public static int howManyNumbers(int size) {
		int number = 0;
		int[][][][][][] array = new int[size][size][size][size][size][size];

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				for (int a = 0; a < array[j].length; a++)
					for (int b = 0; b < array[a].length; b++)
						for (int c = 0; c < array[b].length; c++)
							for (int d = 0; d < array[c].length; d++)
								array[i][j][a][b][c][d] = number++;
		return number;
	}

	/**
	 * ����� ������ �� ����� �������
	 * 
	 * @param array
	 */
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * ����� ������ �� ����� 2� ������� �������
	 * 
	 * @param array
	 */
	public static void print(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			char[] is = array[i];
			for (int j = 0; j < is.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}