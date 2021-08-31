package Iterators;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Character> pq = new PriorityQueue<>();
		pq.add('w');
		pq.add('q');
		pq.add('e');
		pq.add('w');

		Iterator it = pq.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
