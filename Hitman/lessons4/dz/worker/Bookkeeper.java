package ua.Kharkov.Hitman.lessons4.dz.worker;

public class Bookkeeper {
	/*
	 * ����� ��������� ��������� ��������� ����������� � ������� �� �/�. ���
	 * ���� ������ ���� ����������, ������ ���� �������� ���������. ��� �����
	 * ������ �������� �� ������� �����. ������� ����� � ������ �������. �������
	 * ��������� ������ �����������, ����� ���������� ����� ��������.
	 */
	public static double CalcSalary(Worker array[]) {
		double sum = 0;
		for (Worker w : array) {
			sum += w.fullSalary();
		}
		return sum;
	}

}
