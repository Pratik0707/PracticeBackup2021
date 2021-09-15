package Basics;

public class InterfaceDemo {  

	public static void main(String[] args) {
		zoo obj = new zoo();
		obj.colour();
		obj.food();
		obj.OwnMethod();
		Animals a = new zoo();
		Animals.StaticOfInterface(); // call interface's static  method		
	}
}

interface Animals
{
	abstract public void food();
	int q = 0;
	static void StaticOfInterface() // static method in interface
	{
		System.out.println("static method in an interface is allowed ");
	}
}

interface Animals2
{
	abstract public void food();	
}

class zoo implements Animals, Animals2  // implement multiple interfaces
{
	protected zoo()
	{
		System.out.println("zoo constructor");
	}
	public void food()
	{
		System.out.println("food for animals");
	}

	public void colour()
	{
		System.out.println("Animal color");
	}

	void OwnMethod()
	{
		System.out.println("own ethod of zoo");
	}
}