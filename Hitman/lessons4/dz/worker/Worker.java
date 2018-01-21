package ua.Kharkov.Hitman.lessons4.dz.worker;

public abstract class Worker {

	/*
	 * ������� ����������� ����� ���������. � ���� ������ ���� ������ ���
	 * ������� ������ (�/� � ����� ��� 100% ���������), ���������� ������������
	 * �����, � ����� ������ ��� ��������� �������� ������������� ������� �
	 * �������� �� �����. ���������� ����� ���� ���� �����: ����������� �
	 * ��������. ����������� �������� �������� � ������������ � �����������
	 * ������������ �����, � �������� - 100% � ������ ����������� �
	 * ��������������� ������� � ������ �����������. ����� ��������� ���������
	 * ��������� ����������� � ������� �� �/�. ��� ���� ������ ���� ����������,
	 * ������ ���� �������� ���������. ��� ����� ������ �������� �� �������
	 * �����.
	 */

	/**
	 * HOURS - ����� ������� ������ ���������� ��������� �� �-� �������
	 */
	protected static final int HOURS = 160;

	/**
	 * salaryFixed - ������������ ������
	 */
	protected double salaryFixed;

	/**
	 * workHours - ������� ����� ����������� ����������� �� ���� (�����������)
	 */
	protected double workHours;

	/**
	 * ����� ���������� �������� ����. ������
	 * 
	 * @return salaryFixed
	 */
	public double getSalaryFixed() {
		return salaryFixed;
	}

	/**
	 * ������������� �������� ����. ������
	 * 
	 * @param salaryFixed
	 */
	public void setSalaryFixed(double salaryFixed) {
		this.salaryFixed = salaryFixed;
	}

	/**
	 * ����� ���������� �������� �������� ������� ���������� ������������
	 * 
	 * @return workHours
	 */
	public double getWorkHours() {
		return workHours;
	}

	/**
	 * ����� ������������� �������� �������� ������� ���������� ������������
	 * 
	 * @param workHours
	 */
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	// ����������� ��� ����������
	public Worker() {
		this(0, 0);
	}

	// ����������� � �����������
	public Worker(double salaryFixed, double workHours) {
		this.salaryFixed = salaryFixed;
		this.workHours = workHours;
	}

	/**
	 * ����� ������ ��� ������������� ������� � ���� ������. ��������� ���
	 * ������ ������ �� �����.
	 */
	public String toString() {
		return "Zarplata pri 100% otpabotke: " + salaryFixed
				+ " $ ; pabochee vremya otpabotanoe za meciac: " + workHours
				+ "h ; ";
	}

	/**
	 * ����� ��� ������ ������ �� �����
	 */
	public void print() {
		System.out.print(this);
	}

	/**
	 * ����� �������� �������� ������������ ������� �� �����
	 * 
	 * @return percent
	 */
	public double percent() {
		return (workHours * 100) / HOURS;
	}

	/**
	 * ����� �������� ������� ���������
	 * @return
	 */
	public abstract double fullSalary();

}
