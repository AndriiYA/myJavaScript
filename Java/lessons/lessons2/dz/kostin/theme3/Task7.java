package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * � ���������� a � b �������� ����� �����, ��� ���� b ������ a.
		 * �������� ���������, ������� ����� ������������ � �������� �� �����
		 * ����� ��������������� ����� �� ������� [a;b].
		 */
		int a = 5;
		int b = 8;
		System.out.println("������������ ��������������� �����" + ":"
				+ (Math.random() * (b - a) + a));
	}

}
