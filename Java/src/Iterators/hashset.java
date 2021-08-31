package Iterators;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(11);
		hs.add(22);
		hs.add(33);
		hs.add(44);

		Iterator<Integer> it = hs.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("HashSet with heterogenious values : ");
		HashSet hss = new HashSet();
		hss.add("aa");
		hss.add(12);
		hss.add('p');

		Iterator itr = hss.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
