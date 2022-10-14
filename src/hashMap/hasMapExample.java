package hashMap;

import java.util.HashMap;
import java.util.Map;

public class hasMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String> (); // declaration hashMap.
		// add key value pair
		
		hm.put(101, "John");
		hm.put(102, "Steve");
		hm.put(103,  "Peter");
		hm.put(104, "Karen");
		hm.put(105, "David");
		hm.put(106, "Jeeva");
		
		System.out.println(hm);
		
		hm.remove(103);
		System.out.println(hm); // there is no index concept in the hashMap
		
		
		// read values using for loop;
		for (@SuppressWarnings("rawtypes") Map.Entry m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+ m.getValue());
			
		}
		
		
	}

}
