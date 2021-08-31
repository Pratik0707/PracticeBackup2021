package Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);

		Iterator<Integer> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
