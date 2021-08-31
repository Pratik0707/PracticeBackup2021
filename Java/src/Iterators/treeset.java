package Iterators;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(12);
		//		ts.add("ll");// throws error since heterogenious not allowed
		ts.add(44);

		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
