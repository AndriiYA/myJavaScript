package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * ������� ���������, ������� ����� ���������, �������� �� ����� �� ����
		 * ����, �������� �������������, ����������� (�������: ������,
		 * ������). ���� ������� ����� �� �� 5 ����, �� �������� �� ������.
		 * ��������� ������ ��������� ������������ �����, ���� ���� � ��
		 * ������������ ������� ������� ��������. ��������, ����� ������ ���
		 * �����л ������� ����� ������� ������������.
		 */

		System.out.println("Vvedite slovo iz piati bykv: ");
		@SuppressWarnings("resource")
		// ����. ������ ������ ������
		Scanner scn = new Scanner(System.in);
		// ������. ������. �������� + ���������� ����� ������ ����������
		// ��������
		String a = scn.nextLine().toLowerCase();
		// �������� ����� �� 5 ���� ?
		if (a.length() == 5) {
		} else
			System.out.println("Vi vveli slovo ne iz 5 bykv");
		// �������� ��������� ��� ���
		if (a.charAt(0) == a.charAt(4) & a.charAt(1) == a.charAt(3)) {
			System.out.println("Slovo palindrom");
		} else {
			System.out.println("slovo ne palindrom");
		}
	}
}
