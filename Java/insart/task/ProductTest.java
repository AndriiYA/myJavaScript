package ua.Kharkov.Hitman.insart.task;


public class ProductTest {

	public static void main(String[] args) {

		SparlingWater s1 = new SparlingWater();
		Water w1 = new Water();
		System.out.println(s1.toString());
		System.out.println(w1.toString());

		SparlingWater s2 = new SparlingWater(60, "Evian", false);
		Water w2 = new Water(30, "Chinotto", "cherries");
		System.out.println(s2.toString());
		System.out.println(w2.toString());

		Water.avgCost();
		SparlingWater.avgCost();
		System.out.println("    :     ");

		Case myC = new Case();
		myC.add(w1);
		myC.add(s1);
		myC.add(s2);
		myC.add(w2);
		myC.print();

		System.out.println("      :       ");
		myC.sortByCost();
		myC.print();

	}

}
