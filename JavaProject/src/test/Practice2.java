package test;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 4;
		int z = (x * y);

		System.out.println(z);

		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println("first number " + array[0]);
		System.out.println(array.length);
		System.out.println("Last Number " + array[array.length - 1]);

		String[] names = { "john", "Paul", "sam", "mal" };
		System.out.println("First Name " + names[0]);
		System.out.println(names.length);
		System.out.println("Last Name is " + names[names.length - 1]);

		char[] alphabets = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println("First Character is " + alphabets[0]);
		System.out.println("Last character is " + alphabets[alphabets.length - 1]);

	
		if (x == y) {
			System.out.println("both are same");
		}else if(x<y) {
			System.out.println("It is true");
		}if(x>y) {
			System.out.println("it is not true");
		}
		String st1 = "Angus";
		String str2 = "angus";
		if (st1.equals(str2)) {
			System.out.println("they are matching");
		}
			String str1 = st1.toLowerCase();
			if (str1.equals(str2)) {
				System.out.println("They are matching");
			}
			if (st1.equalsIgnoreCase(str2)) {
				System.out.println("They are matchig");
			}
			//swap numbers
			
			int x1 = 1;
			int y1 = 2;
			int z1 =y1;
			y1 = x1;
			x1 = z1;
			System.out.println("X1 Value " +x1 +" "+"Y1 Value " +y1);
			
			int l = 20;
			int m = 2;
			for(int i = 1; i <= 10; i++) {
				System.out.println(l * i);
			}
			while (m<=10) {
			 System.out.println(l * m);
			 m = m+1;
			}
			
			
		}

	}

