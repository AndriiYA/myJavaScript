package ua.Kharkov.Hitman.Figure;

public class TestFigure {
	public static void main(String[] args) {

		Figure[] ob = new Figure[6];
		ob[0] = new Circule();
		ob[1] = new Circule(3, 2, 3);
		ob[2] = new Rectangle();
		ob[3] = new Rectangle(4, 6, 4, 6);
		ob[4] = new Square();
		ob[5] = new Square(4, 57, 7);

		for (Figure a : ob) {
			a.print();
			System.out.println(a.area());
			a.move(300, -56);
		}

		for (Figure a : ob) {
			a.print();
		}
		System.out.println();

		for (Figure a : ob) {
			a.zoom(2);
		}

		for (Figure a : ob) {
			a.print();
		}

		System.out.println();
	}
}