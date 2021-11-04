package StringOperations;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
//WAP to show count of all characters in string
public class Coun_Of_All_Chars {

	public static void main(String[] args) {
		//		String str = "pratpipktri";
		String str = "qwwwwrgttttttttdnvppppppp";
		HashSet hs = new HashSet();
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}
		char[]cr = new char[hs.size()];
		Iterator it = hs.iterator();
		int i=0; 
		while(it.hasNext())
		{
			cr[i++]=(char) it.next();
		}
		for(int n=0;n<cr.length;n++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==cr[n])
				{
					count++;
				}
			}
			System.out.println(cr[n]+" - "+count);
		}

		// easy way 1 : 

		String test1 = "test String";
		char[] str2 = test1.toCharArray();
		Map<String, Long> countMap = new HashMap<>(); 

		for (int q = 0; q < str2.length ; q++) {
			if(countMap.containsKey(String.valueOf(str2[q])))
			{
				countMap.put(String.valueOf(str2[q]), countMap.get(String.valueOf(str2[q])).longValue()+1L);
			} 
			else 
			{
				countMap.put(String.valueOf(str2[q]), 1L);
			}
		}
		System.out.println(countMap);

		// easy way 2 : 

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
	}
}

