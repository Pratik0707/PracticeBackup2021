package Basics;

public class overriding {

	public static void main(String[] args) 
	{
		parent obj = new parent();//object is of parent, so parents's method wil be called
		obj.ma();
		obj.localOfA();

		parent newobj = new Chilld();//object is of child, so child's method wil be called
		newobj.ma();
		newobj.localOfA();

		//	Chilld bsref = new parent();//child reference and parent object: This is NOT ALLOWED in java.
	}
}

class parent
{
	parent()
	{
		System.out.println("parent constructor");
	}
	void ma()
	{
		int a =10;
		int b = 20;
		int sum = a+b;
		System.out.println("parent in ma : "+sum);		
	}

	void localOfA()
	{
		System.out.println("Local method of class parent");
	}
}

class Chilld extends parent
{	
	Chilld()
	{
		System.out.println("Chilld constructor");
	}
	void ma()
	{
		System.out.println("in ma of child");
	}

	void LoaclOfB()
	{
		System.out.println("in local method of child");
	}
}