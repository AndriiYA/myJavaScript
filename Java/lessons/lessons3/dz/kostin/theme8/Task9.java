package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task9 {

	public static void main(String[] args) {
		/*
		 * �������� ��� ������� �� 10 ����� ��������� ����� �� ������� [1;9] �
		 * ������ ������ �� 10 �������������� �����. ������ ������� � i-��
		 * �������� �������� ������� ������ ��������� ��������� �������� ��
		 * ������� ������� � i-�� �������� � �������� �� ������� ������� � i-��
		 * ��������. ������� ��� ��� ������� �� ����� (������ �� ���������
		 * ������), ����� ������� ���������� ����� ��������� � ������� �������.
		 */

		int mas[] = new int[10];
		int mas1[] = new int[10];
		double mas2[] = new double[10];
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.floor(Math.random() * 9 + 1);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (int) Math.floor(Math.random() * 9 + 1);
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			mas2[i] = ((double) mas[i] / mas1[i]);
		}
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "; ");
			if (mas2[i] % 1 == 0) {
				j++;
			}
		}
		System.out.println("\n Kolichestvo tselih elementov v massive 3 ravno "
				+ j);

	}
}
