package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * �������� ������ �� 8 ��������� ����� ����� �� ������� [1;10].
		 * �������� ������ �� ����� � ������. �������� ������ ������� � ��������
		 * �������� �� ����. ����� �������� ������ �� ����� �� ��������� ������.
		 */

		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 10 + 1); // ����������
																	// ���������
																	// �����
																	// ��[1;10]�
																	// ������
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "  "); // ���������� ������� ��������
													// �������������� �������
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {

				array[i] = 0;
			}
			System.out.print(array[i] + " ");

		}

	}

}
