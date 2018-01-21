package ua.Kharkov.Hitman.lessons4.dz.Car;

public abstract class Car {
	private String mark;
	private String color;
	private int V;

	public String getMark() {
		return mark;
	}

	public void setMark(String m) {
		this.mark = m;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	public int getV() {
		return this.V;
	}

	public void setV(int V) {
		this.V = V;
	}

	public Car() {
		this.mark = "BMW";
		this.color = "black";
		this.V = 3;

	}

	public Car(String m, String c, int objem) {
		mark = m;
		color = c;
		V = objem;
	}

	public String toString() {
		return mark + " " + color + " " + V + " L";
	}

	public abstract void beep();

}
