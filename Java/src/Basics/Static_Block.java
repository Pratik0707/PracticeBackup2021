package Basics;

public class Static_Block {
	
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

}
