package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = {4,7,12,18,43
		};
System.out.println("First number " + numbers[0]);
System.out.println("First number " + numbers[1]);
System.out.println(numbers.length);
	System.out.println("Last number " + numbers[numbers.length-1]);
//String names array
	String [] names = {"John","Adam","Eva","Namcy"};
	System.out.println("names " + names[0]);
//Character array
	char[] alphabets = {'a','e','i','o','u'};
	System.out.println("First one " + alphabets[3]);
	
	String str1 = "my name is nick";
	String [] words = str1.split(" ");
	System.out.println("First word is " + words[0]);
	System.out.println("Second word is " + words[1]);
	
	
	}

}
