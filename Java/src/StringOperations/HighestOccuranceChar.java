package StringOperations;
//WAP to return the highest occurred character in a String

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
public class HighestOccuranceChar {

	public static void main(String[] args) {
		String str = "qwwwwrgttttttttdnvppppppp";
		HashSet hs = new HashSet();
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}
		char[]cr = new char[hs.size()];
		Iterator it = hs.iterator();
		int i=0; 
		while(it.hasNext())
		{
			cr[i++]=(char) it.next();
		}
		TreeMap<Character,Integer> tm = new TreeMap<>();

		for(int n=0;n<cr.length;n++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==cr[n])
				{
					count++;
				}
			}
			System.out.println(cr[n]+" - "+count); // print occurance count of every character
			tm.put(cr[n], count);
		}
//		for(Map.Entry<Character, Integer> ent : tm.entrySet()) // use treemap to return max and min occurances
//		{
//			System.out.println(ent.getKey()+" "+ent.getValue());
//		}				
	}
}
