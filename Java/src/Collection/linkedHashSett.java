package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSett {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add('q');
		lhs.add(90);
		lhs.add("hi");
		lhs.add(44);
		lhs.add('g');
		Iterator itr = lhs.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}


