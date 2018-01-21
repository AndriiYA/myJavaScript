package ua.Kharkov.Hitman.lessons4.dz.worker;

public class Bookkeeper {
	/*
	 *  ласс Ѕухгалтер принимает множество сотрудников и считает их з/п. ƒл€
	 * него должно быть прозрачным, какого типа €вл€етс€ сотрудник. ≈му важна
	 * только зарплата за текущий мес€ц. сделать метод в классе Ѕухгалт. который
	 * принимает массив сотрудников, метод возвращает сумму зарплата.
	 */
	public static double CalcSalary(Worker array[]) {
		double sum = 0;
		for (Worker w : array) {
			sum += w.fullSalary();
		}
		return sum;
	}

}
