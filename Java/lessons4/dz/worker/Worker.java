package ua.Kharkov.Hitman.lessons4.dz.worker;

public abstract class Worker {

	/*
	 * Создать абстрактный класс Сотрудник. У него должны быть методы для
	 * задания ставки (з/п в месяц при 100% отработки), количества отработанных
	 * часов, а также методы для получения процента отработанного времени и
	 * зарплаты за месяц. Сотрудники могут быть двух типов: Программист и
	 * Менеджер. Программист получает зарплату в соответствии с количеством
	 * отработанных часов, а менеджер - 100% в случае переработки и
	 * соответствующий процент в случае недоработки. Класс Бухгалтер принимает
	 * множество сотрудников и считает их з/п. Для него должно быть прозрачным,
	 * какого типа является сотрудник. Ему важна только зарплата за текущий
	 * месяц.
	 */

	/**
	 * HOURS - время которое должен отработать сотрудник по з-н Украины
	 */
	protected static final int HOURS = 160;

	/**
	 * salaryFixed - Фиксированая ставка
	 */
	protected double salaryFixed;

	/**
	 * workHours - Рабочее время отработаное сотрудником за меяц (фактическое)
	 */
	protected double workHours;

	/**
	 * метод возвращает значение фикс. ставку
	 * 
	 * @return salaryFixed
	 */
	public double getSalaryFixed() {
		return salaryFixed;
	}

	/**
	 * устанавливает значение фикс. ставки
	 * 
	 * @param salaryFixed
	 */
	public void setSalaryFixed(double salaryFixed) {
		this.salaryFixed = salaryFixed;
	}

	/**
	 * метод возвращает значение рабочего времени фактически отработаного
	 * 
	 * @return workHours
	 */
	public double getWorkHours() {
		return workHours;
	}

	/**
	 * метод устанавливает значение рабочего времени фактически отработаного
	 * 
	 * @param workHours
	 */
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	// конструктор без параметров
	public Worker() {
		this(0, 0);
	}

	// конструктор с параметрами
	public Worker(double salaryFixed, double workHours) {
		this.salaryFixed = salaryFixed;
		this.workHours = workHours;
	}

	/**
	 * Метод служит для представления объекта в виде строки. Требуется для
	 * вывода строки на экран.
	 */
	public String toString() {
		return "Zarplata pri 100% otpabotke: " + salaryFixed
				+ " $ ; pabochee vremya otpabotanoe za meciac: " + workHours
				+ "h ; ";
	}

	/**
	 * Метод для вывода строки на экран
	 */
	public void print() {
		System.out.print(this);
	}

	/**
	 * Метод подсчета процента отработаного времени за месяц
	 * 
	 * @return percent
	 */
	public double percent() {
		return (workHours * 100) / HOURS;
	}

	/**
	 * метод подсчета зарплаті полностью
	 * @return
	 */
	public abstract double fullSalary();

}
