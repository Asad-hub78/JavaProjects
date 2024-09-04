package test;

public class LoopsExample {

	public static void main(String[] args) {
		int x = 24;
		int y = 1;

		while (y <= 10) {

			int result = x * y;
			System.out.println(result);
			y = y + 1;
		}

		System.out.println("end of while loop");

		// normal for loop

		for (int i = 1; i <= 10; i++) {

			System.out.println(x * i);
		}

		// for each loop

		String[] names = { "Jon", "Adam", "Eva", "Nancy" };
		for (String name : names) {

			System.out.println(name);
		}
	}

}
