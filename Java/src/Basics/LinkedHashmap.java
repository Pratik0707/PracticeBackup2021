package Basics;

import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(10, "Ten");
		hm.put(10, "Ten_duplicate");//duplicate keys > stores only latest one
		hm.put(11, "eleven");
		hm.put(null, "1st null");
		hm.put(null, "2nd null");//multiple null > stores only latest one
		System.out.println(hm);

	}

}
