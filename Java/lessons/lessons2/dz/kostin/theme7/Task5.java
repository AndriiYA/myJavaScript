package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * �� �������!!! �������� �� ����� ��� ����� ������������������ 2an-1�1,
		 * ��� a1=2, ������� ������ 10000.
		 */
		for (int a = 2, i = 1; i < a; a = 2 * a - 1, i++) {
			if (a <= 10000) {
				System.out.print(a + " ");
			}
		}
	}
}
