package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Alan");
		System.out.println("Alan Sugae");

		String Fname = ("Alan");
		String Lname = ("Sugae");
		System.out.println(Fname);
		System.out.println(Lname);
		String Fullname = (Fname + " " + Lname);
		System.out.println(Fullname);
		System.out.println(Fullname.length());
		System.out.println(Fullname.toUpperCase());
		System.out.println(Fullname.toLowerCase());
		System.out.println(Fullname.charAt(8));
		String Newname = Fullname.replace("Sugae", "Parker");
		System.out.println(Newname);
		System.out.println(Newname.contains("Parker"));
		boolean check = Newname.contains("Parker");
		System.out.println(check);
		System.out.println(Newname.indexOf('A'));
		char c = 'A';
		System.out.println(Newname.indexOf(c));
		
	}

}
