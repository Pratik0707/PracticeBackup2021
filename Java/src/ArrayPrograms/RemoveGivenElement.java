package ArrayPrograms;

import java.util.ArrayList;
// WAP to remove all occurrences of 10 from array
public class RemoveGivenElement {

	public static void main(String[] args) {
		int[]a = {10,5,9,7,10,0,10,4,3,10}; 
		ArrayList al = new ArrayList(); 
		for(int i : a)
		{
			al.add(i);
		}
		ArrayList remove = new ArrayList();  
		remove.add(10);
		al.removeAll(remove); // removes all occurrences of collection 'remove'
		System.out.println(al);		

	}
}
