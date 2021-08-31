package Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(10, "ten");
		hs.put(5, "five");
		hs.put(11, "eleven");

		//		System.out.println(hs);

		Iterator it = hs.keySet().iterator();

		System.out.println("v"+hs.values());
		System.out.println("key"+hs.keySet());
		System.out.println(hs.get(5));
		System.out.println("Entry Set  "+hs.entrySet());
		System.out.println(hs);

		while(it.hasNext())
		{
			int i = (int) it.next();
			System.out.println(i +"  "+ hs.get(i));
		}

		System.out.println("Key Value pair is -> ");
		for(Integer itr : hs.keySet())
		{
			System.out.print(itr);
			for(String strr : hs.values())
			{
				System.out.print(strr);
			}
		}

		System.out.println("Key and value pairs are : ");

		for(Map.Entry<Integer, String> mp : hs.entrySet()) //Best way to iterate
		{
			System.out.println(mp.getKey() +"  "+mp.getValue());
		}

		HashMap<String, String> hss = new HashMap<>();
		hss.put("aa", "ten");
		hss.put("bb", "five");

		Iterator itt = hss.keySet().iterator();

		while(itt.hasNext())
		{
			String ss = (String)itt.next();
			System.out.println(ss+"  "+hss.get(ss));


		}
	}

}
