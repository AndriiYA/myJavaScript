package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		/*
		 * ��� ��������� ������������� � ���������� ������������ �����
		 * ���������� ����� ���� ��� ���� (������� �� �������� ������� ����
		 * ����� � �����).
		 */

		int a;
		int b = 0;
		System.out.print("B��� ������������ ����� - ");

		Scanner scn = new Scanner(System.in);
		for (a = scn.nextInt(); a != 0; a /= 10) {
			b = b + (a % 10);
		}
		System.out.println(b + " ");
		scn.close();
	}

}
