package Collection;

import java.util.Hashtable;
import java.util.TreeMap;

public class hashTable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(10, "ten");
		ht.put(11, "eleven");
		ht.put(10, "twelve");
		ht.put(15, "ten");
		ht.put(1, "ten");

		System.out.println(ht);

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(10, "pratik");
		tm.put(5,"zz");
		tm.put(12, "aa");
		tm.put(1,"xyz");
		tm.put(10, "prik");
		tm.put(101, "pratik");
		tm.put(111, "pratik");
		
		System.out.println(tm);


	}

}
