package Collection;
import java.util.*;

// WAP to find numbers greater than 50 from given numbers ** use treeset
public class TreeSet_ex {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10); ts.add(52); ts.add(19);ts.add(102); ts.add(1);ts.add(55);ts.add(40);
		
		System.out.println(ts);
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			int a = (int) it.next();
			if(a>=50)
			{
				System.out.println("values greater than equal 50 is : "+a);
			}
		}
		

	}

}
