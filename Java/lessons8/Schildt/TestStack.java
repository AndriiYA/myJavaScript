package ua.Kharkov.Hitman.lessons8.Schildt;

public class TestStack {
	public static void main(String args[]) {

		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(8);

		// protalkivanie chisel v stack
		for (int i = 0; i < 5; i++)
			mystack1.push(i);
		for (int i = 0; i < 8; i++)
			mystack2.push(i);

		// vitalkivanie chisel iz stack
		System.out.println("Stack v mystack1:");
		for (int i = 0; i < 5; i++)
			System.out.println(mystack1.pop());
		System.out.println("Stack v mystack2:");
		for (int i = 0; i < 8; i++)
			System.out.println(mystack2.pop());

	}
}
