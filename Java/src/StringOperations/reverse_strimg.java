package StringOperations;
// WAP to reverse a string
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