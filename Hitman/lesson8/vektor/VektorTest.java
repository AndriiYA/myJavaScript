package ua.Kharkov.Hitman.lesson8.vektor;
public class VektorTest {

	public static void main(String[] args) {
		 Vektor<Integer> ob = new Vektor<Integer>();
		 ob.add(3);
		 ob.add(4);
		 ob.add(5);
		 ob.add(6);
		 ob.add(7);
		 ob.add(8);
		 ob.add(9);
		 ob.add(9);
		 ob.add(9);
		 ob.add(9);
		 ob.add(0, 7777);
		 ob.add(3, 9999);
		 ob.add(456);
		 ob.add(23423);
		 ob.add(6, 9345);
		 ob.print();
		 ob.remove(3);
		 ob.print();

	}
}