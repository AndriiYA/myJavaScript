package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * �������� ������ �� ���� �������� ����� �� 1 �� 99, �������� ��� ��
		 * ����� � ������, � ����� ���� �� ������ �������� �� ����� ���� �
		 * ������, �� � �������� ������� (99 97 95 93 � 7 5 3 1).
		 */

		int[] array = new int[50];
		for (int i = 0, n = 1; i < array.length; n = n + 2, i++) {
			array[i] = n;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
