package StringOperations;

import java.util.HashMap;
import java.util.Map;

public class Count_Of_All_Sub_Strings {

	public static void main(String[] args) {
		String test1 = "test all string test hello test all";
		String[] strarr = test1.split(" ");
		//char[] str2 = test1.toCharArray();
		Map<String, Long> countMap = new HashMap<>(); 

		for (int q = 0; q < strarr.length ; q++) {
			if(countMap.containsKey(String.valueOf(strarr[q])))
			{
				countMap.put(String.valueOf(strarr[q]), countMap.get(String.valueOf(strarr[q])).longValue()+1L);
			} 
			else 
			{
				countMap.put(String.valueOf(strarr[q]), 1L);
			}
		}
		System.out.println(countMap);
	}
}
