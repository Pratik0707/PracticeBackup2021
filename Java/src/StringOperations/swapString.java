package StringOperations;
import java.util.ArrayList;

//swap two string variables without using third or temp variable in java?
public class swapString {

	public static void main(String[] args) {
		String one = "first";
		String two = "Second";
		System.out.println("before swap : "+one+" "+two);
		ArrayList<String> als = new ArrayList<>();
		als.add(one);
		als.add(two);
		one = als.get(1);
		two = als.get(0);
		System.out.println("After swap : "+one+" "+two);
	}

}
