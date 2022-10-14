package arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String>  list = new ArrayList<String> (); // declaration array list
		
	    // add values to the ArrayList
		
		list.add("John");
		list.add("Joseph");
		list.add("Moses");
		list.add("David");
		list.add("Scott");
		
		// print added list elements
		System.out.println("Added Items in an Array:" +list);
		//size of an element
		System.out.println("Size of an Array:" +list.size());
		
		// remove an element
		list.remove(2);		
		System.out.println("Removed an Array Element:"+list);
		
		// add a new item to an array
		list.add(1, "Jeeva");
		System.out.println("Added new item in an array:"+list);
		
		//print array list using for loop
		
		for (Object s:list) {
			
			System.out.println("List of items from the Array List:" +s);

		}
		

	}

}
