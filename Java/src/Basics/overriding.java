package Basics;

public class overriding {

	public static void main(String[] args) 
	{
		a obj = new a();//object is of a, so a's method wil be called
		obj.ma();

		a newobj = new b();//object is of b, so b's method wil be called
		newobj.ma();
	}
}

class a
{
	void ma()
	{
		int a =10;
		int b = 20;
		int sum = a+b;
		System.out.println("in ma : "+sum);		
	}
}

class b extends a
{	
	void ma()
	{
		System.out.println("in ma of class B");
	}
}




















