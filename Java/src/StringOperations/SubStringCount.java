package StringOperations;

public class SubStringCount {
	// count number of times 'man' comes in given string 
	//i/p : "gman,sheman,heman,imanu"
	public static void main(String[] args) {
		String given = "gman,sheman,heman,imanu,pratik";
		int count = 0;
		String[]myArr = given.split(",");
		for(String ss : myArr)
		{
			if(ss.contains("man"))
			{
				count++;
			}			
		}
		System.out.println("count of man is : "+count);
	}
}
