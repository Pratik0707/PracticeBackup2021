package Collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(10, "pratik");
		tm.put(5,"zz");
		tm.put(12, "aa");
		tm.put(1,"xyz");

		System.out.println(tm);
		for(Map.Entry<Integer, String> mpi : tm.entrySet())
		{
			System.out.println("Key: "+mpi.getKey()+" value: "+mpi.getValue());
		}
	}
}
