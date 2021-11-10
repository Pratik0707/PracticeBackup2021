package StringOperations;

public class split_string {

	public static void main(String[] args) {
		String ss = "HelloPratikHelloPratik";

		String []strArr = ss.split("Pratik");

		for(int i=0;i<strArr.length;i++)
		{
			System.out.println(strArr[i]);
		}

		CharSequence strArr1 = ss.subSequence(2, 5);

		System.out.println(strArr1);
		
		String ss2 = "HelloPratikHelloPratik";
		String []strArr2 = ss2.split("");

		for(int i=0;i<strArr2.length;i++)
		{
			System.out.println(strArr2[i]);
		}
	}
}