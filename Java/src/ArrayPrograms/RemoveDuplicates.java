package ArrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//WAP to remove duplicates from array 
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]a = {10,5,22,78,9,3,6,4,10,10,10,10,22,5};	

		HashSet<Integer> hst = new HashSet<>();  // WAY 1 : Use HashSet
		for(int i=0;i<a.length;i++)
		{
			hst.add(a[i]);
		}
		System.out.println("Elements in array without duplicates are : ");
		Iterator it = hst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		HashSet al = new HashSet();    // WAY 2 : Use contains method
		for(int i : a)
		{
			if(!(al.contains(i)))
			{
				al.add(i);
			}
		}
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}


		//other way : 
//		int[]newar = new int [a.length];
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length-1;j++)
//			{
//				if(!(a[i]==a[j]))
//				{
//					newar[i]=a[i];
//				}
//			}
//		}
//		System.out.println("Array without duplicates is : ");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(newar[i]);
//		}
	}
}
