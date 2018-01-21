package ua.Kharkov.Hitman.lessons7;

public abstract class Figure {
	/*
	 * Определите классы: "Фигура", "Прямоугольник", "Треугольник", "Круг"
	 * 
	 * Фигура должна быть абстрактным классом. Этот класс хранит координаты х и
	 * у - расположения фигуры.
	 * 
	 * Круг, Прямоугольник (Rectangle) и Треугольник (Triangle) должны
	 * наследовать Фигура.
	 * 
	 * Определить следующие методы класса Круг: - првоерка что точка находится в
	 * кругу - проверка что другой круг находится в кругу
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
	 * Методы класса: 1) метод вывода на экран; 2) метод для перемещения; 3)
	 * метод масштабирования - умножения значений координат на масштабный
	 * коэффициент. 4) абстрактный метод подсчета площади
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
