package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task7 {

	public static void main(String[] args) {
		// �������� ������ �� 20-�� ������ ����� ��������� � �������� ��� ��
		// �����. ����������, ��� ������ � ������ ����� ������������������ �����
		// ��������, � ������ ��������� � ����� ���� ����������.

		int a = 1, b = 1;
		int n = 18;
		System.out.print(a + " " + b);
		int[] mas = new int[18];
		for (int i = 0; i < n; i++) {
			mas[i] = a + b;
			a = b;
			b = mas[i];
			System.out.print(" " + mas[i]);
		}
	}

}
