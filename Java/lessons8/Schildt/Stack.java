package ua.Kharkov.Hitman.lessons8.Schildt;

public class Stack {
	private int stck[];
	private int tos;

	// rezervirovanie i inicializaciya steka
	Stack(int size) {
		stck = new int[size];
		tos = -1;
	}

	// protalkivanie elementov v stek
	void push(int item) {
		if (tos == stck.length - 1) // ispolzovanie chlenov dlini massiva
			System.out.println("stek polon.");
		else
			stck[++tos] = item;
	}

	// Vitalkivanie elementov iz steka
	int pop() {
		if (tos < 0) {
			System.out.println("Stek ne zagrygen.");
			return 0;
		} else
			return stck[tos--];
	}

}
