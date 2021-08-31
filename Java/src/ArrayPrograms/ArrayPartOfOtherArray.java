package ArrayPrograms;

import java.util.ArrayList;

//WAP to check if one array is a part of another array
public class ArrayPartOfOtherArray {

	public static void main(String[] args) {
		int[]a = {10,5,8,3,14};
		int[]b = {88,63,14,78,56,9,3,7,5,4};
		int[]c = {14,78,56,9,3,7,5,10,5,8,3,14};
		ArrayList al1 = new ArrayList();
		for(int i : a)
		{
			al1.add(i);
		}
		ArrayList al2 = new ArrayList();
		for(int q : c)
		{
			al2.add(q);
		}
		if(al2.containsAll(al1)) // Contains method : check entire colection part of other colection
		{
			System.out.println("Contains");
		}

		if(al1.contains(5)) // check presence in collection
		{
			System.out.println("contains 5");
		}
	}
}
