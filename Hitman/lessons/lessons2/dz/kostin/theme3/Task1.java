package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ��������� � ������� �� ����� �������� ����� � 60, 45 � 40 ��������
		 * ��� ������������� ������� Math.toDegrees(n)..
		 */
		int a = 60;
		int b = 45;
		int c = 40;
		float a_60 = (float) Math.cos(Math.toRadians(a));
		float b_45 = (float) Math.cos(Math.toRadians(b));
		float c_40 = (float) Math.cos(Math.toRadians(c));
		System.out.println("������� 60 = " + a_60);
		System.out.println("������� 45 = " + b_45);
		System.out.println("������� 40 = " + c_40);
	}

}
