package ua.Kharkov.Hitman.lesson10.exception;

public class TryCatchBlocks {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("oops");
			// e.printStackTrace();
		}

		System.out.println(2);
	}
}
