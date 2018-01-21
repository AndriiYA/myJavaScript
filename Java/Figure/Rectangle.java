package ua.Kharkov.Hitman.Figure;

public class Rectangle extends Figure {

	/**
	 * � - ������� ��������������
	 */
	private int a;

	/**
	 * b - ������� ��������������
	 */
	private int b;

	/**
	 * ���������� �������� �
	 * 
	 * @return �
	 */
	public int getA() {
		return a;
	}

	/**
	 * ������������� �������� �
	 * 
	 * @param a
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * ���������� �������� b
	 * 
	 * @return b
	 */
	public int getB() {
		return b;
	}

	/**
	 * ������������� �������� b
	 * 
	 * @param b
	 */
	public void setB(int b) {
		this.b = b;
	}

	// ����������� ��� ����������
	public Rectangle() {
		this(0, 0, 0, 0);
	}

	// ����������� � �����������
	public Rectangle(int x, int y, int a, int b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}

	public double area() {
		return a * b;
	}

	public String toString() {
		return "Rectangle" + super.toString() + a + "; " + b + ": x";
	}
}
