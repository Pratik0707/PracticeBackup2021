package Basics;

public class InterfaceDemo {  

	public static void main(String[] args) {
		zoo obj = new zoo();
		obj.colour();
		obj.food();
		obj.OwnMethod();
		Animals a = new zoo();
		//a.colour();
		Animals a1 = new Animals()
		{			
			public void food() 
			{
				System.out.println("main -> food");
			}
		}
	}
}

interface Animals
{
	abstract public void food();
	int q = 0;
	//void colour();
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