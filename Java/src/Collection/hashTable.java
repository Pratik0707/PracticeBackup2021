package Collection;

import java.util.Hashtable;
import java.util.Map;
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

		

		

	}

}
