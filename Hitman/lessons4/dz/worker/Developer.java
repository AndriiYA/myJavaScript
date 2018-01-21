package ua.Kharkov.Hitman.lessons4.dz.worker;

public class Developer extends Worker {

	// Конструктор без параметров
	public Developer() {
		this(0, 0);
	}

	// Конструктор с параметрами
	public Developer(double salaryFixed, double workHours) {
		super(salaryFixed, workHours);
	}

	public double fullSalary() {
		return salaryFixed / 100 * percent();
	}

}
