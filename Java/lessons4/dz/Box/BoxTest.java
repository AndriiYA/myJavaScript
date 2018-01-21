package ua.Kharkov.Hitman.lessons4.dz.Box;

public class BoxTest {
	public static void main(String args[]) {

		/*
		 * Box myBox1 = new Box(); Box myBox2 = new Box(); // ѕрисваивание
		 * значений переменным экземпл€ра myBox1 // инициализаци€ каждого
		 * экземпл€ра Box
		 * 
		 * myBox1.setDim(10, 20, 15); myBox2.setDim(3, 6, 9);
		 * 
		 * System.out.println("ќбьем равен " + myBox1.volume());
		 * 
		 * System.out.println("обьем равен " + myBox2.volume());
		 * 
		 * int x, y, r, t; y = 7; t = 198; x = Box.NFS(y); r = Box.NFS(t);
		 * System.out.println(x + ", " + r);
		 */

		Box myBox1 = new Box(10, 15, 20);
		Box myBox2 = new Box(15, 45, 10);
		System.out.println(myBox1.volume());
		System.out.println(myBox2.volume());

	}

}
