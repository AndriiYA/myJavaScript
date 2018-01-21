package ua.Kharkov.Hitman.lessons7;

public class TestCircule {
	public static void main(String[] args) {
		Figure[] ob = new Figure[2];
		ob[0] = new Circule();
		ob[1] = new Circule(3, 2, 3);
		for (Figure a : ob) {
			a.print();
			System.out.println(a.area());
			a.move(300, -56);
		}

		for (Figure a : ob) {
			a.print();
		}

		for (Figure a : ob) {
			a.zoom(2);
		}

		for (Figure a : ob) {
			a.print();
		}

	}
}
