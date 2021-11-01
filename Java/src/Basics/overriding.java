package Basics;

public class overriding {

	public static void main(String[] args) 
	{
		parent obj = new parent();//object is of a, so a's method wil be called
		obj.ma();
		obj.localOfA();

		parent newobj = new Chilld();//object is of b, so b's method wil be called
		newobj.ma();
		newobj.localOfA();
		
	//	Chilld bsref = new parent();//child reference and parent object: This is NOT ALLOWED in java.
		
	}
}

class parent
{
	void ma()
	{
		int a =10;
		int b = 20;
		int sum = a+b;
		System.out.println("in ma : "+sum);		
	}
	
	void localOfA()
	{
		System.out.println("Local method of class A");
	}
}

class Chilld extends parent
{	
	void ma()
	{
		System.out.println("in ma of class B");
	}
	
	void LoaclOfB()
	{
		System.out.println("in local method of class B");
	}
}




















