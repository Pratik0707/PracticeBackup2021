package Basics;

import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add(12);
		ll.add("ee");
		ll.add('r');
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
	}
}
