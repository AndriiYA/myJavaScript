package ua.Kharkov.Hitman.lessons7;

public class Circule extends Figure {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circule() {
		this(0, 0, 0);
	}

	public Circule(int x, int y, int r) {
		super(x, y);
		this.r = r;

	}

	@Override
	public double area() {
		return r * r * Math.PI;
	}

	@Override
	public String toString() {
		return "Circule" + super.toString() + r;
	}

}
