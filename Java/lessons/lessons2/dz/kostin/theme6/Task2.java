package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.Scanner;

public class Task2 {

	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * ������� ���������, ������� ����� ��������� � �������� �� ����� �����
		 * ���� ����� �����, �������� �������������. ���� ������������
		 * ����������� ����� ���� �� ���� �� �����, �� �������� �� ������.
		 */

		sc = new Scanner(System.in);
		int a;
		System.out.print("������� ����� �����:  ");
		sc = new Scanner(System.in);
		int b;
		if (sc.hasNextInt()) {

			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		} else {
			System.out.println("�� ����� �� ����� �����");
		}

	}

}
