package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

import java.util.Scanner;

public class Task11 {
	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * ������������ ������ ������� � ���������� ������ ������������� �����,
		 * � ��������� ������ ������� ������ ���������� ������� �� ���������
		 * ����� ����� �� [-5;5] � ������� ��� �� ����� � ������. ����� �����
		 * ��������� ������ ���������� � �������� ������������ � ���, �����
		 * ������� ����� �������� ������� ������: ����� ��� ������, ����
		 * ��������, ��� ��� ����� ������� �����. ���� ������������ �����
		 * ������������ �����, �� ��������� ������ ��������� ���������� ����� ��
		 * ��� ���, ���� �� ����� ������� ���������� ��������.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		int left = 0, right = 0;

		sc = new Scanner(System.in);
		do {
			System.out.print("������� ����� �����: ");
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				if (a > 0 && a % 2 == 0) {
					int mas[] = new int[a];

					for (int i = 0; i < mas.length; i++) {

						mas[i] = (int) (Math.random() * 11 - 5);
						System.out.print(mas[i] + " ");
					}
					b = mas.length / 2;
					for (int i = 0; i < b; i++) {
						left = left + Math.abs(mas[i]);
					}
					for (int i = b; i < mas.length; i++) {
						right = right + Math.abs(mas[i]);
					}
					if (left < right) {
						System.out.print("������ ����� ������");
					} else if (left > right) {
						System.out.print("����� ����� ������");
					} else {
						System.out.print("�����");
					}
				}
			}

		} while (a <= 0 || a % 2 != 0);

	}
}
