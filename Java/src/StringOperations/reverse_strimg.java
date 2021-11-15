package StringOperations;
// WAP to reverse a string

import java.util.Arrays;
import java.util.Collections;

public class reverse_strimg {

	public static void main(String[] args) {
		
		String s1="Pratik";
		char[]p = s1.toCharArray();
		
		for(int i=p.length-1;i>=0;i--)
		{
			System.out.print(p[i]);
		}
	}
}

// easy way : 

//StringBuilder One = new StringBuilder(partOne);
//StringBuilder Two = new StringBuilder(partTwo);
//String output1 = One.reverse().toString();
//String output2 = Two.reverse().toString();// reverse
//String finalOutput = output1+" "+output2;
//System.out.println("Reversed string : "+finalOutput);

// Another way : 

//String[] arrx = {"alpha", "beta", "gamma"};
//Collections.reverse(Arrays.asList(arrx));
//System.out.println(Arrays.toString(arrx));



