package Basics;

public class pp {
static int v =0;
	String[] args= {"1","2"};
	public static void main(String[] args) {
		ppp b = new ppp();
		System.out.println(b.a+" "+b.b);
		 
		
		for(int index=0;true;index++)
		{
			System.out.println("hjkfshf");
			break;
		}
		
		if(args.length>0)
		{
			System.out.println(args.length);
		}

		int r =1;
		//if(r)
		{
			System.out.println("pratik");
		}
//		System.out.println(ppr());
		
		String a = new String("pp");
		String j = new String("pp");
		System.out.println(a==j);
		System.out.println(a.equals(j));
		
	}
	public int ppr()
	{
		int v =50;
		return v;
	}

}

class ppp 
{
	protected int a,b;
}