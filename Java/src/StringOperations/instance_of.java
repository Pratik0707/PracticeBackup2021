package StringOperations;

import java.util.ArrayList;

public class instance_of {

	public static void main(String[] args) {
		String ss = "nd%67sb)nd76<k6>g23p";
		char[]aa = ss.toCharArray();
		System.out.println(aa);
		ArrayList al = new ArrayList();
		for(int i=0;i<aa.length;i++)
		{
			try
			{
				int  r = Integer.parseInt(String.valueOf(aa[i]));
				Integer a = r;
				if(a instanceof Integer)
				{					
					al.add(a);
				}
			}
			catch(Exception E)
			{
				continue;
			}
		}
		System.out.println("numbers from given string : "+al);
	}
}

