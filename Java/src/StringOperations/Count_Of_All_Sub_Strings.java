package StringOperations;

import java.util.HashMap;
import java.util.Map;

public class Count_Of_All_Sub_Strings {

	public static void main(String[] args) {
		String test1 = "test all string test hello test all";
		String[] strarr = test1.split(" ");
		//char[] str2 = test1.toCharArray();
		Map<String, Long> countMap = new HashMap<>(); 

		for (int i=0; i < strarr.length; i++) {
			if(countMap.containsKey(String.valueOf(strarr[i])))
			{
				countMap.put(String.valueOf(strarr[i]), countMap.get(String.valueOf(strarr[i])).longValue()+1L);
			} 
			else 
			{
				countMap.put(String.valueOf(strarr[i]), 1L);
			}
		}
		System.out.println(countMap);
	}
}
//string.valueOf() method converts different types of values into string. 
//By the help of string valueOf() method, you can convert int to string, 
//long to string, boolean to string, character to string, float to string, 
//double to string, object to string and char array to string.