package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme6;

import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
		int i = 2;
		System.out.print("������� ����� �����: ");
		if (sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� �����
								// ������� ����� �����
			i = sc.nextInt(); // ��������� ����� ����� � ������ ����� �
								// ��������� � ����������
			System.out.println(i * 2);
		} else {
			System.out.println("�� ����� �� ����� �����");
		}
	}

}
