package StringOperations;

import java.util.HashMap;
import java.util.Map;

// WAP to find if any bracket is without it's pair [[]](()<<>>>><
public class bracketString {

	public static void main(String[] args) {
		String test1 = "[[]](()<<>>>><";
		char[] str = test1.toCharArray();
		Map<String, Long> countMap = new HashMap<>();
		HashMap<String, Long> countMap1 = new HashMap<>();
		for (int i = 0; i < str.length ; i++) {
		    if(countMap.containsKey(String.valueOf(str[i]))) {
		        countMap.put(String.valueOf(str[i]), countMap.get(String.valueOf(str[i])).longValue()+1L);
		    } else {
		        countMap.put(String.valueOf(str[i]), 1L);
		    }
		}
		System.out.println(countMap);
		if(countMap.get("[") == countMap.get("]")) {
		    System.out.println("Count equal for brackets : [ and ]");
		} else {
		    System.out.println("Count not equal for brackets : [ and ]");
		}
		if(countMap.get("(") == countMap.get(")")) {
		    System.out.println("Count equal for brackets : ( and )");
		} else {
		    System.out.println("Count not equal for brackets : ( and )");
		}
		if(countMap.get("<") == countMap.get(">")) {
		    System.out.println("Count equal for brackets : < and >");
		} else {
		    System.out.println("Count not equal for brackets : < and >");
		}

	}

}
