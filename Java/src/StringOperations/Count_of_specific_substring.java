package StringOperations;

public class Count_of_specific_substring {

	public static void main(String[] args) {
		String test1 = "test all string test all hello test all";
		String []arr = test1.split(" ");
		String sbuStr = "all";
		int count=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(sbuStr))
			{
				count++;
			}
		}
		System.out.println("cout of "+sbuStr+" is : "+count);
	}
}
