package Basics;

public class Static_Block {
	int i=10;
	static
	{
		System.out.println("In static block");
		//throw new Exception("Exception message");
		try
		{
			throw new Exception("Exception message");
		}
		catch(Exception E)
		{

		}
	}

	static
	{
		System.out.println("static block2");
	}

	public static void main(String[] args) {
		System.out.println("In main");
	}

	private static void add() {
		// TODO Auto-generated method stub
	}

	private static void mmpp() {
		// TODO Auto-generated method stub
	}
}
