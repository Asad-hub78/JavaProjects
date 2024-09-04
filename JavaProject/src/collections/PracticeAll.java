package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeAll {
	public static void main(String []args) {
		List <String> names = new ArrayList<>();
		names.add("Asad");
		names.add("sam");
		names.add("Bill");
		System.out.println(names);
		System.out.println("First Name is " + names.get(0));
		System.out.println("Last Name is " + names.get(2));
		names.remove(1);
		System.out.println(names);
		names.add("Khan");
		System.out.println(names);
		names.set(2, "Sam");
		System.out.println(names);
		for(String k: names) {
			System.out.println(k);
		}		
		Collections.sort(names);
		System.out.println(names);
	Map<String, String> mins = new HashMap<>();
	mins.put("PM", "Ganja");
	mins.put("CM", "Dinton");
	mins.put("FM", "Chawal");
	System.out.println(mins);
	mins.put("CM", "Bill");
	System.out.println(mins);
	mins.remove("FM");
	System.out.println(mins);
	Set<String> Keys = mins.keySet();
	for(String k : Keys) {
	System.out.println("Key is " + k);
	System.out.println(mins.get(k));
	}
	}

}

