package StringOperations;
//WAP to replace every 't' with 5,6,7... from String "This is test method";
import java.util.ArrayList;

public class interviewQue {

	public static void main(String[] args) {
		//String Test = "This is test method";
		//      OP :     5his is 6es7 me8hod

		//		String given = "This is test method";
		//
		//		ArrayList al = new ArrayList();
		//		al.add(given);
		//
		//		for(int i=0;i<al.size();i++)
		//		{
		//			int a = 5;
		//			String part1 = (String) al.get(i); 
		//			String add = Integer.toString(a);
		//			char cr = add.charAt(0);
		//			char[]cc=part1.toCharArray();
		//			String newStr = "";
		//			for(int j=0;j<cc.length;j++)
		//			{
		//				if(cc[j]=='t'||cc[j]=='T')
		//				{
		//					cc[j]=cr;
		//					a=cr;
		//					a++;
		//				}
		//				newStr = newStr+cc[j]; 
		//			} 
		//			// a++;
		//			System.out.println(newStr);
		//		}
		//	}
		String Test = "This is test method";
		char[] strArr = Test.toCharArray();
		int start = 5;
		for (int i = 0; i< strArr.length ; i++) {
			if(String.valueOf(strArr[i]).equalsIgnoreCase("T")) {
				strArr[i] = (char)(start+'0');
				start++;
			}
		}

		String b = String.valueOf(strArr);
		System.out.println(b);
	}	
}

