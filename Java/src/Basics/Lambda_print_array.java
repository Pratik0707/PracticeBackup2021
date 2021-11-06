package Basics;

import java.util.ArrayList;
import java.util.HashSet;

public class Lambda_print_array {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(11);
		al.add(10);

		al.forEach((n) -> {System.out.println(n);}); //lambda expression to print arraylist element. 

		HashSet hs = new HashSet();
		hs.add("hi");
		hs.add("hello");
		hs.add("pp");

		hs.forEach((n)-> {System.out.println(n);});
	}

}
