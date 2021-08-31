package Basics;

public class For {

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6,7,8,9,0};

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

			if(a[i]==7)
			{
				System.out.println("in continue");
				continue;
			}
		}

		For objj = new For();
		objj.abc();
		StaticABC();
		
		System.out.println("Reverse");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);

			if(a[i]==5)
			{
				break;
			}
			System.out.println("in for"+a[i]);
		}
		System.out.println("out side for");

	}

	void abc()
	{
		int b;
		System.out.println("in abc");
	}

	static void StaticABC()
	{
		int b;
		System.out.println("in StaticABC");
	}
}

