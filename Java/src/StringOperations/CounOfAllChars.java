package StringOperations;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
//WAP to show count of all characters in string
public class CounOfAllChars {

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
		
		// easy way : 
		
		String test1 = "test string";
        char[] str2 = test1.toCharArray();
        Map<String, Long> countMap = new HashMap<>(); 

        for (int q = 0; q < str2.length ; q++) {
            if(countMap.containsKey(String.valueOf(str2[q]))) {
                countMap.put(String.valueOf(str2[q]), countMap.get(String.valueOf(str2[q])).longValue()+1L);
            } else {
                countMap.put(String.valueOf(str2[q]), 1L);
            }
        }
        System.out.println(countMap);
        
        
	}
}
