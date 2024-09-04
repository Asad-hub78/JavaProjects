package test;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2356;
		int y = 3123;
		int z = y;
		y = x;
		x = z;

		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		int p = 50;
		int q = 12;

		p = p + q; // 62
		q = p - q; // 62 - 12 =50
		p = p - q; // 62 - 50 = 12

		System.err.println("P = " + p);
		System.out.println("Q = " + q);
	}

}
