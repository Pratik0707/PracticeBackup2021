package Basics;

public class instance_of {

	public static void main(String[] args) {
		String ss = "nd%67sb)nd76<k6>g23p";
		char[]aa = ss.toCharArray();
		System.out.println(aa);
		
		for(int i=0;i<aa.length;i++)
		{
			//int  r = Integer.parseInt(String.valueOf(aa[i]));
			Integer a = (int) aa[i];
			System.out.println("int"+a);
			if(a instanceof Integer)
			{
				System.out.println(a);
			}
		}
	}
}
