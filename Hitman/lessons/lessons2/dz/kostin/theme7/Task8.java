package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * �������� �� ����� ��� ������������� �������� ������������ �����,
		 * ��������� ������������� � ����������.
		 */

		int n;
		int a = 0;
		System.out.print("������� ���� ����������� ����� - ");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt(); // ���������� ������ ���� � ������ ������ �����
							// ������� �����
		System.out.print("����� " + n + " ������� �� - ");
		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
				a++;
				System.out.print(i + " ");
			}
		}
		System.out.println("���������� ��������� - " + a);

	}

}
