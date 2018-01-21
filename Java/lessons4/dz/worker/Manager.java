package ua.Kharkov.Hitman.lessons4.dz.worker;

public class Manager extends Worker {

	// Конструктор без параметров
	public Manager() {
		this(0, 0);
	}

	// Конструктор с параметрами
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
