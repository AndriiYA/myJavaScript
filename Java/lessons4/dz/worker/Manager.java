package ua.Kharkov.Hitman.lessons4.dz.worker;

public class Manager extends Worker {

	// ����������� ��� ����������
	public Manager() {
		this(0, 0);
	}

	// ����������� � �����������
	public Manager(double salaryFixed, double workHours) {
		super(salaryFixed, workHours);
	}

	public double fullSalary() {
		if (workHours > HOURS) {
			return salaryFixed;
		} else {
			return salaryFixed / 100 * percent();
		}
	}

}
