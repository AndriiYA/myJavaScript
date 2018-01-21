package ua.Kharkov.Hitman.lessons3.dz.lesson3;

public class Task3 {

	public static void main(String[] args) {
		int a, b;
		for (a = 1, b = 4; a < b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		// cyma vseh elementov massiva
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int x : nums)
			sum += x;
		System.out.println("vse elementi massiva summa : " + sum);
		// cyma piati elementov massiva
		int sum1 = 0;
		int nums1[] = { 11, 12, 13, 14, 15, 16, 17, 18, 9, 10 };
		for (int x1 : nums1) {
			System.out.println("znachenie ravno:" + x1);
			sum1 += x1;
			if (x1 == 5)
				break;
		}
		System.out.println("summa piati pervih elementov ravna" + sum1);

	}

}
