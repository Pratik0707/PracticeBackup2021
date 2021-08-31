package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("pp");
		hs.add('r');
		hs.add(10);
		hs.add("pp");
		hs.add('w');
		hs.add(14);
		System.out.println(hs.contains('r'));

		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
