package ua.Kharkov.Hitman.lessons4.dz.Car;

public class Audi extends Car {
	private int sitTemperature;

	public void setSitTemperature(int t) {
		this.sitTemperature = t;
	}

	public int getSitTemperature() {
		return this.sitTemperature;
	}

	@Override
	public String toString() {
		return "Audi" + super.toString();
	}

	@Override
	public void beep() {
		System.out.println("bbeeeeeeep");
	}
}
