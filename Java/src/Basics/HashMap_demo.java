package Basics;

import java.util.HashMap;

public class HashMap_demo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Ten");
		hm.put(10, "Ten_duplicate");//duplicate keys > stores only latest one
		hm.put(11, "eleven");
		hm.put(null, "1st null");
		hm.put(null, "2nd null");//multiple null > stores only latest one
		System.out.println(hm);
	}
}
