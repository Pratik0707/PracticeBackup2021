package Collection;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {

		Map<Integer, String> tm = new TreeMap<>();
		tm.put(10, "pratik");
		tm.put(5,"zz");
		tm.put(12, "aa");
		tm.put(1,"xyz");
		tm.put(10, "prik");
		tm.put(101, "pratik");
		tm.put(111, "pratik");

		// Map iterator

		for(Map.Entry<Integer, String>mp : tm.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}


































	}

}
