package ua.Kharkov.Hitman.Figure;

public class Circule extends Figure {

	/**
	 * r - ������
	 */
	private int r;

	/**
	 * ����� ���������� �������� r
	 * 
	 * @return r
	 */
	public int getR() {
		return r;
	}

	/**
	 * ����� ������������� �������� r
	 * 
	 * @param r
	 */
	public void setR(int r) {
		this.r = r;
	}

	// ����������� �� ���������, ��� ����������
	public Circule() {
		this(0, 0, 0);
	}

	// ����������� � �����������
	public Circule(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public double area() {
		return r * r * Math.PI;
	}

	public String toString() {
		return "Circule" + super.toString() + r + "; ";
	}

}
