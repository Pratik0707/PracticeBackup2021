package Basics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(10, 11);
		ht.put(10, 11);
		ht.put(20, 21);
		ht.put(30, 11);
		System.out.println(ht);
	}

}
