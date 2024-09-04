package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<String> names = new ArrayList<>();
   names.add("asad");
   names.add("raj");
   names.add("sam");
   System.out.println(names);
   System.out.println("The First Value is " + names.get(0));
   System.out.println("The First Value is " + names.get(1));
   System.out.println("The First Value is " + names.get(2));
   System.out.println("The First Value is " + names.size());
  //remove sam from list 
   names.remove(2);
   System.out.println(names);
   //add asad
   names.add("asad");
   System.out.println(names);
   //Asad to Aasad
   names.set(2, "Aasad");
   System.out.println(names);
   //loop through the array
   
   for(String n: names) {
	   System.out.println(n);
   }
   Collections.sort(names);
   System.out.println(names);
	}
	

}
