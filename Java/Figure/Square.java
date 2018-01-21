package ua.Kharkov.Hitman.Figure;

public class Square extends Figure {

	/**
	 * � - ������� ��������
	 */
	private int a;

	/**
	 * ����� ���������� �������� �
	 * 
	 * @return �
	 */
	public int getA() {
		return a;
	}

	/**
	 * ����� ������������� �������� �
	 * 
	 * @param a
	 */
	public void setA(int a) {
		this.a = a;
	}

	// ����������� ��� ����������
	public Square() {
		this(0, 0, 0);
	}

	// ����������� � �����������
	public Square(int x, int y, int a) {
		super(x, y);
		this.a = a;
	}

	public double area() {
		return a * a;
	}

	public String toString() {
		return "Square" + super.toString() + a + ": ";
	}

}
