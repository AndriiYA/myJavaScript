package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task14 {

	public static void main(String[] args) {
		/*
		 * � ������ N ���� ������� ����� �� ������� ���������� 50000 ���������
		 * �����. ��� �������� ���������� ����������� ������ ������ �������� ���
		 * ������ ����� �������� � ������� �� 00001 �� 50000 � �������
		 * ����������, �� ����� �������� ����������, ��������� ��� ��������
		 * ������ ��-�� ������������� �� ������� ����� 2, ������� ��� ��������,
		 * � ������� ������� ����������� ���� ��� ����� ������ (��������, 00002
		 * ��� 20202) � ���� ��������������. �������� ���������, �������
		 * ���������� ������� ����� ����� ��������� �������� ��������� �
		 * ����������� ������.
		 */

		// int brak = 0;
		// int tablichki =50000;
		// boolean hasTwo = false;
		// for (int i = 0; i <= tablichki; i++) {
		// int j = i;
		// hasTwo = false;
		// while (j > 0) {
		// if (j % 10 == 2) {
		// hasTwo = true;
		// break;
		// }
		// j = j / 10;
		// }
		// if (hasTwo)
		// brak++;

		// }
		// System.out.println(brak);

		int x = 24;
		int a, b, c;
		b = 0;
		for (int i = 1; i <= x; i++) {
			c = i;
			a = 0;
			while (c != 0) {
				if (c % 10 == 2) {
					a = 1;
					break;
				}
				c = c / 10;
			}
			if (a == 0) {
				b++;
			}
		}
		System.out.println(x - b + " - brak tablic");

	}

}
