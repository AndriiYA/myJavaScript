package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task10 {

	public static void main(String[] args) {
		/*
		 * �������� ������ �� 11 ��������� ����� ����� �� ������� [-1;1],
		 * �������� ������ �� ����� � ������. ���������� ����� �������
		 * ����������� � ������� ���� ����� � �������� �� ���� ��������� ��
		 * �����. ���� ��� �����-�� �������� ����������� ���������� ����������
		 * ���, �� �� �������� ������.
		 */

		int mas[] = new int[11];
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.floor(Math.random() * 3 - 1);
			System.out.print(mas[i] + "; ");
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 1) {
				a++;
			} else if (mas[i] == 0) {
				b++;
			} else {
				c++;
			}
		}
		if (a > b && a > c) {
			System.out.println("bolwe vsego *1*" + ": " + a);

		} else if (b > a && b > c) {
			System.out.println("bolwe vseh *0*" + ": " + b);
		} else if (c > a && c > b) {

			System.out.println("bolwe vseh *-1*" + ": " + c);
		}
	}
}
