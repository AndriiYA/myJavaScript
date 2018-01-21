package ua.Kharkov.Hitman.Figure;

public class Rectangle extends Figure {

	/**
	 * а - сторона прямоугольника
	 */
	private int a;

	/**
	 * b - сторона прямоугольника
	 */
	private int b;

	/**
	 * возвращает значение а
	 * 
	 * @return а
	 */
	public int getA() {
		return a;
	}

	/**
	 * устанавливает значение а
	 * 
	 * @param a
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * возвращает значение b
	 * 
	 * @return b
	 */
	public int getB() {
		return b;
	}

	/**
	 * устанавливает значение b
	 * 
	 * @param b
	 */
	public void setB(int b) {
		this.b = b;
	}

	// Конструктор без параметров
	public Rectangle() {
		this(0, 0, 0, 0);
	}

	// Конструктор с параметрами
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
