package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * �������� ������ �� 4 ��������� ����� ����� �� ������� [10;99],
		 * �������� ��� �� ����� � ������. ���������� � ������� �� �����
		 * ��������� � ���, �������� �� ������ ������ ������������
		 * �������������������.
		 */

		int[] array = new int[4];
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 89 + 10);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				a = 1;
				break;
			}
		}
		if (a == 1) {
			System.out.println("posledovatelnost ne vozrastaet");
		} else {
			System.out.println("Posledovatelnost vozrastaet");
		}

	}

}
