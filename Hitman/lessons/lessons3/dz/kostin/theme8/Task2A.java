package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task2A {

	public static void main(String[] args) {
		/*
		 * ������� ��������� ������ �� 5 ����� �� 8 �������� � ������ ��
		 * ��������� ����� ����� �� ������� [-99;99]. ������� ������ �� �����.
		 * ����� �� ��������� ������ ������� �� ����� �������� �������������
		 * �������� ����� ������� (��� ������ �� ����� ��������).
		 */

		int[][] array = new int[5][8];
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 200 - 100);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" :" + array[i][j] + ": ");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				if (max < array[i][j])
					max = array[i][j];
		}
		System.out.println("Max: " + max);
	}
}
