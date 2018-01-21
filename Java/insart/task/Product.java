package ua.Kharkov.Hitman.insart.task;

/**
 * 1. ������� 3 ������, ����������� 2 ���� ������� ������. ���� �� ������� �
 * �������, ������ � ������ � ��������� ���� �������. � ������ � �����������
 * ���� ����� � ���������. � ����������� ������ ���� ��������� ����� ����.
 * 
 * 1.1. � ������� ������ ���� ��� ������������: ������ � �����������������,
 * ������ get set ��� ������� ����, ����� public String toString(), ������������
 * ��������� ������������� �������.
 * 
 * 1.2. ������� ����� ������ ���� �����������.
 * 
 * 1.3. ��� ������ ����������� ����� � ������ ����� � ���������� ������� ����
 * ������.
 * 
 * 2. ������� ��������� ��� �������� �������. � ��� ������ ���� �����������
 * ������ Add, Count, ����� ������� �� �������, ���������� �� ���� � ������
 * �����������.
 * 
 * 3. ��������� ���������, �����������, �������������, �����������.
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
	 * ����������� ��� ����������
	 */
	public Product() {
		this.cost = 0;
		this.name = "";
	}

	/**
	 * ����������� � �����������
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
