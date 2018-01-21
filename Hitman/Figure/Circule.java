package ua.Kharkov.Hitman.Figure;

public class Circule extends Figure {

	/**
	 * r - радиус
	 */
	private int r;

	/**
	 * Метод возвращает значение r
	 * 
	 * @return r
	 */
	public int getR() {
		return r;
	}

	/**
	 * Метод устанавливает значение r
	 * 
	 * @param r
	 */
	public void setR(int r) {
		this.r = r;
	}

	// Конструктор по умолчанию, без параметров
	public Circule() {
		this(0, 0, 0);
	}

	// Конструктор с параметрами
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
