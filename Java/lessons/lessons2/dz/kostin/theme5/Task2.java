package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme5;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * ������� ���������, ��������� �� ����� �������� ���������������
		 * ���������� ����������� ����� � ��� ���������� �����. ������� ������
		 * ���������: � ����� 208 ���������� ����� 8 � ����� 774 ����������
		 * ����� 7 � ����� 613 ���������� ����� 6
		 */

		int a = 100;
		int b = 999;
		int c = (int) (Math.random() * (b - a) + a);
		int maximum = 0;
		int m;
		System.out.print(" � ����� " + c + " ");
		do {
			m = c % 10;
			if (m > maximum)
				maximum = m;
			c = c / 10;
		} while (m > 0);
		System.out.println("���������� ����� " + maximum);

	}
}
