package ua.Kharkov.Hitman.insart.task;

/**
 * 1. Создать 3 класса, описывающие 2 типа некоего товара. Один из классов –
 * базовый, второй и третий – описывают типы товаров. В первом – обязательны
 * поля «цена» и «название». В наследниках должны быть объявлены новые поля.
 * 
 * 1.1. В классах должны быть два конструктора: пустой и параметризованный,
 * методы get set для каждого поля, метод public String toString(), возвращающий
 * строковое представление объекта.
 * 
 * 1.2. Базовый класс должен быть абстрактным.
 * 
 * 1.3. При помощи статических полей и метода найти и отпечатать среднюю цену
 * товара.
 * 
 * 2. Создать контейнер для хранения товаров. В нем должны быть реализованы
 * методы Add, Count, метод доступа по индексу, сортировки по цене и печати
 * содержимого.
 * 
 * 3. Заполнить контейнер, распечатать, отсортировать, распечатать.
 * 
 * 
 */
public abstract class Product implements Comparable<Product> {
	protected String name;
	protected double cost;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * конструктор без параметров
	 */
	public Product() {
		this.cost = 0;
		this.name = "";
	}

	/**
	 * конструктор с параметрами
	 * 
	 * @param cost
	 * @param name
	 */
	public Product(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}

	abstract public String toString();

	public int compareTo(Product o) {
		return (int) (this.cost - o.getCost());
	}

}
