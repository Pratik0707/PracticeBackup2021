package StringOperations;
import java.util.Arrays;
public class Anagram {

	//	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
	//	typically using all the original letters exactly once.
	//	 
	//	Example 1:
	//
	//	Input: strs = ["eat","tea","tan","ate","nat","bat"]
	//	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	//	Example 2:
	//
	//	Input: strs = [""]
	//	Output: [[""]]
	//	Example 3:
	//
	//	Input: strs = ["a"]
	//	Output: [["a"]]

	public static void main(String[] args) {

		String str1 = "Keep";
		String str2= "Peek";
		String s1 = str1.replaceAll("\\s", "");  
		String s2 = str2.replaceAll("\\s", "");  
		boolean status = true; 

		if (s1.length() != s2.length()) 
		{  
			status = false;  
		} 
		else 
		{  
			char[] ArrayS1 = s1.toLowerCase().toCharArray();  
			char[] ArrayS2 = s2.toLowerCase().toCharArray();  
			Arrays.sort(ArrayS1);  
			Arrays.sort(ArrayS2);  
			status = Arrays.equals(ArrayS1, ArrayS2);  
		}  
		if (status) 
		{  
			System.out.println(s1 + " and " + s2 + " : anagrams");  
		} 
		else 
		{  
			System.out.println(s1 + " and " + s2 + " : not anagrams");  
		}  
	}
}
