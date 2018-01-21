package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task3A {

	public static void main(String[] args) {
		/*
		 * C������ ��������� ������ �� 7 ����� �� 4 ������� � ������ ��
		 * ��������� ����� ����� �� ������� [-5;5]. ������� ������ �� �����.
		 * ���������� � ������� �� ����� ������ ������ � ���������� �� ������
		 * ������������� ���������. ���� ����� ����� ���������, �� �������
		 * ������ ������ ������������� �� ���.
		 */

		int[][] array = new int[7][4];
		int imax = 0, pmax = 0, p1 = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 12 - 6);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" |" + array[i][j] + "| ");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[j].length; j++) {
				p1 = p1 * array[i][j];
			}
			if (Math.abs(p1) > Math.abs(pmax)) {
				imax = i;
				pmax = p1;
			}
			System.out.println(i + " " + p1);
			p1 = 1;
		}
		System.out.println("\n");
		System.out.println("Naiboljshij indeks: " + imax);
	}
}
