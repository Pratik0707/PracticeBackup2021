package Basics;

public class overriding {

	public static void main(String[] args) 
	{
		a obj = new a();
		obj.ma();

		a newobj = new b();
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





















