package oops;

public class ConstructorExample {
	String Name;
	int RollNo;

	public ConstructorExample(String name, int rollNo) {
		this.Name = name;
		this.RollNo = rollNo;
	}

	public ConstructorExample(String name, int rollNo, int std) {

		this.Name = name;
		this.RollNo = rollNo;
		this.RollNo = std;
	}


}
 class Vehicle {
	String name = "Mustang";
	int model =  2024;
	public void Car() {
System.out.println("Horn Hurn");
	}
 }
