package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme5;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ������� ���������, ������� ����� ��������� ������ �� ��������
		 * ��������� �� ������� [5;155] ����� ����� � �������� (25;100) �
		 * �������� ��������� �� �����. ������� ������ ���������: ����� 113 ��
		 * ���������� � ��������� (25,100) ����� 72 ���������� � ���������
		 * (25,100)
		 */

		int min = 5;
		int max = 155;
		int n = (int) (Math.random() * (max - min) + min);
		System.out.print((" ����� ") + n);
		if (n >= 25 && n < 100) {
			System.out.println(" ���������� � ��������� (25;100) ");
		} else {
			System.out.println(" �� ���������� � ��������� (25;100)");
		}

	}

}
