package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
	public static void main(String[] args) {

	Map<String, String> practice = new HashMap<>(); 
	practice.put("Name", "Robert");
	practice.put("Email", "abc@example.com");
	practice.put("Phone", "078965165");
	System.out.println(practice);
    practice.put("Name","Sam");
    System.out.println(practice);
	practice.remove("Email");
	System.out.println(practice);
	}
}
