package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_collection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();   
		// adding elements to the ArrayList   
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
 
		// printing the ArrayList   
		System.out.println("Before Sorting: "+ list);   
		// >>>> SORT ArrayList    
		Collections.sort(list);  
		
		System.out.println("After sort: "+ list);

	}
}





