package Collection;
import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "one");
		hm.put(2, "one");
		hm.put(1, "three");
		hm.put(11, "one");
		
		System.out.println(hm);

	}

}
