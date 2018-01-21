package ua.Kharkov.Hitman.lessons4.dz.worker;

public class WorkerTest {
	public static void main(String[] args) {
		Worker[] ob = new Worker[4];
		ob[0] = new Developer();
		ob[1] = new Developer(3000, 130);
		ob[2] = new Manager();
		ob[3] = new Manager(2500, 140);

		for (Worker a : ob) {
			a.print();
			System.out.print(a.percent() + "%");
			System.out.println("; " + a.fullSalary() + "$");
		}
		System.out.println("Oбщая зарплата сотрудников - "
				+ Bookkeeper.CalcSalary(ob) + " $");
		// Bookkeeper b = new Bookkeeper();
		// System.out.println(b.AllSalaries(2437.5, 2187.5, 1500)
		// + " - общая зарплата сотрудников");

	}
}