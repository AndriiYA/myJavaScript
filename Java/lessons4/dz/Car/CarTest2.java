package ua.Kharkov.Hitman.lessons4.dz.Car;

public class CarTest2 {
	public static void main(String[] args) {
		// Car c2 = new BMW();

		Car[] vars = new Car[2];
		vars[0] = new Audi();
		vars[1] = new BMW();

		for (Car c : vars) {
			c.beep();
		}

		// BMW b = new BMW();
		// b.setColor("black");
		// System.out.println(b);
		//
		//
		// Audi a = new Audi();
		// System.out.println(a);
	}
}
