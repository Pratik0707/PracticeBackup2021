package Basics;

public class constructor {

	public static void main(String[] args) 
	{
		constructor obj = new constructor();
	}

	test1 object = new test1();

	test1 object2 = new test1(10, 'P');

	public class test1
	{
		int a;
		char c;

		test1() // non parametarized 
		{
			System.out.println("in NON-parametarized ");
		}

		test1(int i, char x)
		{
			a=i;
			c=x;
			System.out.println("In parametarized constructors  "+i+" "+c);
		}
	}
}


