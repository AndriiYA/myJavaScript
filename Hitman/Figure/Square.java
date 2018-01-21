package ua.Kharkov.Hitman.Figure;

public class Square extends Figure {

	/**
	 * а - сторона квадрата
	 */
	private int a;

	/**
	 * Метод возвращает значение а
	 * 
	 * @return а
	 */
	public int getA() {
		return a;
	}

	/**
	 * Метод устанавливает значение а
	 * 
	 * @param a
	 */
	public void setA(int a) {
		this.a = a;
	}

	// Конструктор без параметров
	public Square() {
		this(0, 0, 0);
	}

	// Конструктор с параметрами
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
