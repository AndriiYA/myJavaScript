package ua.Kharkov.Hitman.lessons7;

public abstract class Figure {
	/*
	 * ���������� ������: "������", "�������������", "�����������", "����"
	 * 
	 * ������ ������ ���� ����������� �������. ���� ����� ������ ���������� � �
	 * � - ������������ ������.
	 * 
	 * ����, ������������� (Rectangle) � ����������� (Triangle) ������
	 * ����������� ������.
	 * 
	 * ���������� ��������� ������ ������ ����: - �������� ��� ����� ��������� �
	 * ����� - �������� ��� ������ ���� ��������� � �����
	 */
	private int x;
	protected int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Figure() {
		this(0, 0);
	}

	public Figure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * ������ ������: 1) ����� ������ �� �����; 2) ����� ��� �����������; 3)
	 * ����� ��������������� - ��������� �������� ��������� �� ����������
	 * �����������. 4) ����������� ����� �������� �������
	 */

	@Override
	public String toString() {
		return x + " " + y;
	}

	public void print() {
		System.out.println(this);
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public void zoom(int k) {
		this.x *= k;
		this.y *= k;
	}

	public abstract double area();
}
