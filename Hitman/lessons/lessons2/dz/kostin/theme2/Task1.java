package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme2;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * � ���������� q � w �������� ��� ����������� �����. ��������
		 * ���������, ��������� �� ����� ��������� ������� q �� w � ��������.
		 * ������ ������ ��������� (��� ������, ����� � q �������� 21, � � w
		 * �������� 8):
		 * 
		 * 21 / 8 = 2 � 5 � �������
		 */
		int q = 78, w = 8;
		System.out.println("");
		System.out.println(q + " / " + w + " = " + (q / w) + " i "
				+ ((int) (((q / w) + 0.5) * 10) % 10) + " v ostatke ");
	}
}
