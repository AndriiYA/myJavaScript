package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task13 {

	public static void main(String[] args) {
		/*
		 * � ������ N ������ � ������� �������������� �� �������� ��������
		 * �������. ������ ������ ���������� ���� ���������� � �������
		 * ���������� ����� ������� � �������� �� 000001 �� 999999. �����������
		 * ��������� ������� � �������� ����� ������ ��� ���� ������ �����
		 * ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102
		 * ��� 567576. ���������� ���� ������ �������� ������� ����������
		 * ������� ����������� ������ � ������ �����������, ��� ����� ���������
		 * �����������. � ������� ��������� ����������� ������� ����������
		 * ������� � ����� ������?
		 */

		int m, j, s1, s2; // ot 1000 do 999999
		j = 0;
		for (int i = 3000; i <= 999999; i++) {
			m = i / 1000;
			s1 = 0;
			s2 = 0;
			while (m != 0) {
				s1 = s1 + m % 10;
				m = m / 10;
			}
			m = i % 1000;
			while (m != 0) {
				s2 = s2 + m % 10;
				m = m / 10;
			}
			if (s1 == s2) {
				j++;
			}
		}
		System.out.println("Trebujetsa kolihestvo suvenirov: " + j);

	}
}
