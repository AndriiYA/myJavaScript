package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.Scanner; // ����������� �����

public class Task1 {
	private static Scanner sc;

	public static void main(String[] args) {

		/*
		 * ������� ���������, ������� ����� ��������, �������� �� ����� �����,
		 * �������� �������������, ������ ��� ��������. ���� ������������
		 * ����� �� ����� �����, �� �������� ��� �� ������.
		 */

		sc = new Scanner(System.in);
		int i = 2;
		System.out.print("������� ����� �����: ");
		if (sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� �����
								// ������� ����� �����
			i = sc.nextInt(); // ��������� ����� ����� � ������ ����� �
								// ��������� � ����������
			if (i % 2 == 0)
				System.out.println("chetnoe");
			else
				System.out.println(" ne chetnoe");
		} else {
			System.out.println("�� ����� �� ����� �����");
		}

	}

}
