package Basics;

import java.io.IOException;
import java.util.Hashtable;
import java.util.TreeMap;

public class TreemaP {

	public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException
	{
		TreeMap ht = new TreeMap();
		ht.put(10, 11);
		ht.put(80, 11);
		ht.put(10, 111);
		ht.put(20, 21);
		ht.put(30, 11);
		ht.put(null, 454);
		System.out.println(ht);

	}

}
