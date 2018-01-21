package ua.Kharkov.Hitman.CurrentThread;

public class DemoJoin {

	public static void main(String[] args) {

		NewThreadFour ob1 = new NewThreadFour("one");
		NewThreadFour ob2 = new NewThreadFour("two");
		NewThreadFour ob3 = new NewThreadFour("three");
		System.out.println("1 potok zapywen: " + ob1.t.isAlive());
		System.out.println("2 potok zapywen: " + ob2.t.isAlive());
		System.out.println("3 potok zapywen: " + ob3.t.isAlive());
		// o#idaem zaverwenia potokov
		try {
			System.out.println("o#idaem zaverwenia potokov. ");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Glavniy potok prervan");
		}
		System.out.println("potok 1 zapywen: " + ob1.t.isAlive());
		System.out.println("potok 2 zapywen: " + ob2.t.isAlive());
		System.out.println("potok 3 zapywen: " + ob3.t.isAlive());
		System.out.println("Glavniy kapyt");
	}

}
