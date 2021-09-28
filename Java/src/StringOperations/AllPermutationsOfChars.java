package StringOperations;
import java.util.Set;
import java.util.TreeSet;
//WAP to find all the permutations of a string 
public class AllPermutationsOfChars {

	public static void main(String[] args) {

		AllPermutationsOfChars al = new AllPermutationsOfChars();
		al.permute("abc");
		
	}

	public static Set<String> permute(String inp)
	{
		Set<String> set = new TreeSet<String>();

		if (inp.length() == 1)
		{
			set.add(inp);
		}
		else
		{
			for (int i=0; i<inp.length(); i++)
			{
				String pre = inp.substring(0, i);
				String post = inp.substring(i+1);
				String remaining = pre+post;

				for (String sstr : permute(remaining))
				{
					set.add(inp.charAt(i) + sstr);
				}
			}
		}
		System.out.println(set);
		return set;
	}
}





//
//public class AllPermutationsOfChars {
//
//	public static void main(String[] args) {
//		
//		for (String s : AllPermutationsOfChars.permute("abca"))
//		{
//			System.out.println(s);			
//		}
//	}
//
//	public static Set<String> permute(String chars)
//	{
//		// Use sets to eliminate semantic duplicates (aab is still aab even if you switch the two 'a's)
//		// Switch to HashSet for better performance
//		Set<String> set = new TreeSet<String>();
//
//		// Termination condition: only 1 permutation for a string of length 1
//		if (chars.length() == 1)
//		{
//			set.add(chars);
//		}
//		else
//		{
//			// Give each character a chance to be the first in the permuted string
//			for (int i=0; i<chars.length(); i++)
//			{
//				// Remove the character at index i from the string
//				String pre = chars.substring(0, i);
//				String post = chars.substring(i+1);
//				String remaining = pre+post;
//
//				// Recurse to find all the permutations of the remaining chars
//				for (String permutation : permute(remaining))
//				{
//					// Concatenate the first character with the permutations of the remaining chars
//					set.add(chars.charAt(i) + permutation);
//				}
//			}
//		}
//		return set;
//	}
//}