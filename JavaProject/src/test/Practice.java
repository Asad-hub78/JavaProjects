package test;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(100);
int x = 10;
int y = 2;
System.out.println(x * y);
 y =4;
 System.out.println(x * y);
 int z = (x * y);
System.out.println(z);
int a = (z - x);
System.out.println(a);
int s = (a/2 - x/2);
System.out.println(s);
	
	//Array Example
int [] values = {1, 2, 3, 4, 5, 6};
System.out.println("First number " + values[0]);
System.out.println("Second number " + values[1]);
System.out.println(values.length);
System.out.println("Last number " + values[values.length-1]);

String [] str1 = {"John", "Pal", "Bec", "tec"};
System.out.println("names " + str1[0]);
System.out.println("names " + str1[3]);

String Name = "my namw is mac";
String []word = Name.split("");
System.out.println("First word " + word[6]);

char[] alphabet = {'a','e','i','o','u'};
System.out.println("First alphabet " + alphabet[3]);
	
//loops
int m = 20;
int n = 1;
System.out.println(m * n);
while (n <= 10) {
	int result = m*n;
	System.out.println(result);
     n = n+1;
}
for (int i=1; i <= 10; i++) {
	System.out.println(m * i);
}
	
	}

}
