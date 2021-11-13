package StringOperations;

public class operator {

	public static void main(String[] args) {
		String s1 = new String ("pratik");
		String s2 = new String ("pratik");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//false
//new operator involved so 2 different strings created in heap area &s1, s2 points to 2 strings
		String s3 = "pratikT";
		String s4 = "pratikT";
		String s5 = new String("pratikT");
		System.out.println(s3.equals(s4));//true
		System.out.println(s3==s4);//true
//s3,s4 NO 'new' is used so strings created only in SCP not in heap. and both point to same string
		System.out.println(s3.equals(s5));//true
	}

}
