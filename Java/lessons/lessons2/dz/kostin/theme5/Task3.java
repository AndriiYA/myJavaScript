package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme5;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * � ��� ���������� a, b � c ���� �������� ������������� ��� �����
		 * ������� �������� ����� ����� �����. ������� ���������, �������
		 * ���������� ����� � ���������� ����� �������, ����� ��� ������ ��
		 * ����� ������������������ a, b � c ��������� ������ ������������.
		 * ����� � ���������� a, b � c: 3, 9, -1 ������������
		 * ������������������: -1, 3, 9 ����� � ���������� a, b � c: 2, 4, 3
		 * ������������ ������������������: 2, 3, 4 ����� � ���������� a, b � c:
		 * 7, 0, -5 ������������ ������������������: -5, 0, 7
		 */

		int a = 7;
		int b = 0;
		int c = -5;
		System.out.print("����� � ���������� a, b � c: ");
		if (a > b & b > c & c < a) {

			System.out.println("������������ ������������������ " + " " + c
					+ " " + b + " " + a);
		} else if (a > b & b < c & c > a) {

			System.out.println("������������ ������������������" + " " + b
					+ " " + a + " " + c);
		} else if (a < b & b > c & c > a) {
			System.out.println("������������ ������������������" + " " + a
					+ " " + c + " " + b);
		} else if (a < b & b > c & c < a) {
			System.out.println("������������ ������������������" + " " + c
					+ " " + a + " " + b);
		} else if (a < b & b < c & c > a) {
			System.out.println("������������ ������������������" + " " + a
					+ " " + b + " " + c);
		} else if (a > b & b < c & c > b) {
			System.out.println("������������ ������������������" + " " + b
					+ " " + c + " " + a);
		}
	}

}
