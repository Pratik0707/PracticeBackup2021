package StringOperations;

import java.util.HashMap;
import java.util.Map.Entry;
// find duplicates with exact duplication count = 2
public class Duplicate_find_only_second_duplicates {

	public static void main(String[] args) {
		String input = "Hello this hi hello is hi";
		HashMap<Character, Integer> cntMap= new HashMap<>();
		String input2 = input.toLowerCase();// convert input to lower case so that output wont be case sensitive. Use this string for further operation
		char[] strArray = input.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (cntMap.containsKey(c)) 
			{				
				cntMap.put(c, cntMap.get(c) + 1); // If char is present in charCountMap,incrementing it's count by 1
			}
			else 
			{
				cntMap.put(c, 1);// If char is not present in charCountMap,// putting this char to charCountMap with 1 as it's value
			}
		}
		System.out.println(cntMap);// Printing the charCountMap

		// Count of characters with exactly 2 occurances OR print characters that occurs exactly 2 times

		for(Entry<Character, Integer> mpi : cntMap.entrySet())
		{
			if(mpi.getValue()==2)
			{
				System.out.println("Key: "+mpi.getKey()+" value: "+mpi.getValue());
			}
		}
	}
	
}
