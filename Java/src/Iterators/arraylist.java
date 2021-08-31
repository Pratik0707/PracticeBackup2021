package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> als = new ArrayList<>();
		als.add("abc");
		als.add("ppp");
		als.add("dsad");

		Iterator itr = als.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		ArrayList<Character> ac = new ArrayList<>();
		ac.add('y');
		ac.add('e');
		ac.add('h');

		Iterator<Character> itc = ac.iterator();

		while(itc.hasNext())
		{
			System.out.println(itc.next());
		}

	}
}
