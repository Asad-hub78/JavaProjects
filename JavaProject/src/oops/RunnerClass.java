package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.Name = "Niraj";
		e1.EmpId = 1000;
		e1.Salary = 60000;

		e2.Name = "Chandra";
		e2.EmpId = 2000;
		e2.Salary = 7000;

		e1.Display();
		e2.Display();

		StringOperations obj1 = new StringOperations();
		String rev = obj1.ReverseString("Indika");
		System.out.println(rev);

		System.out.println(obj1.isPalindrome("rohan"));

		ConstructorExample student1 = new ConstructorExample("Mike", 100);
		System.out.println(student1.Name);
		System.out.println(student1.Name);
		
		ConstructorExample student2 = new ConstructorExample("Mike",300, 200);
		System.out.println(student2.Name);
		System.out.println(student2.RollNo);
		
		StaticExample st1 = new StaticExample("Jatin",200);
		StaticExample st2 = new StaticExample("Asad",300);
		StaticExample st3 = new StaticExample("atin",400);
	   System.out.println(st1.name);
	   System.out.println(st1.rollNo);
System.out.println(StaticExample.institue);
StaticExample.institue = "Howard";
System.out.println(StaticExample.institue);

AccessModifierExample ac1 = new AccessModifierExample();
ac1.name = "Henry";
ac1.rollNo = 100;
ac1.std = 5;
ac1.setInstitute("oxford");
System.out.println(ac1.getInstitute());
	
	}

}
