package ua.Kharkov.Hitman.lessons4.dz.Figure;

public class Figure {
	private String x;
	private String y;

	// 1. "X"
	public String getx() {
		return this.x;
	}

	public void setx(String x) {
		this.x = x;
	}

	// 2. "Y"
	public String gety() {
		return this.y;
	}

	public void sety(String y) {
		this.y = y;
	}

	//  онструктор по умолчанию (без параметров)
	public Figure() {
		this.x = "x";
		this.y = "y";
	}

	public String toString() {
		return x + " " + y;
	}

}
