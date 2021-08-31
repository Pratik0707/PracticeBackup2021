package StringOperations;

import java.util.ArrayList;

public class practice {

	public static void main(String[] args) {
		String ss = "hello l this is prt";
		String[]p = ss.split(" ");
		for(String str : p)
		{
			int i = 5;
			String s1 = str.substring(0, 1);
			String s2 = str.substring(1);
			String s3 = String.vueOf(i);
			String sf = s3+s2;
			System.out.println(sf);
			i++;
		}	
		String test = "This is test method";
		char[] cr = test.toCharArray();
		for(char c : cr)
		{
			if(String.vueOf(c).equsIgnoreCase("t"))
			{
				int v = 5;
				char cc = (char)val;
				val++;
				c = cc;
			}

			System.out.print(c);
		}

		String a="121p";
		StringBuilder sb = new StringBuilder(a);
		String nst = String.valueOf(sb.reverse());
		if(a.equalsIgnoreCase(nst))
		{
			System.out.println("palimrom");
		}
		else
		{
			System.out.println("NOT palimrom");
		}

		String rpl = "t";
		String sp = ss.replaceAll(rpl, "");
		char[]crp = test.toCharArray();
		char[]newarr = new char[crp.length];
		char rplc = 't';
		for(int i=0;i<crp.length;i++)
		{
			if(!(crp[i]==rplc))
			{
				newarr[i] = crp[i];
			}
			System.out.print(newarr[i]);
		}

		String sr = "123";
		ArrayList al = new ArrayList();
		al.co
	}

}
