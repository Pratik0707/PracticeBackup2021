package Basics;

public class wrapper {
	//wrapper classes provide a way to use primitive data types (int, char, short, byte, etc) as objects. 
	public static void main(String[] args) {
		//		Integer myInt = 5;
		//		Double myDouble = 5.99;
		//		Character myChar = 'A';
		//		System.out.println(myInt.intValue());
		//		System.out.println(myDouble.doubleValue());
		//	    System.out.println(myChar.charValue());

		//		int x=3;
		//		if(x==2);
		//		x=0;
		//		if(x==3);
		//		x++;
		//		//else x+=2;
		//		System.out.println(x);



		try
		{
			badMethod();
			System.out.println("A");

		}
		catch(Exception ex)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");

	}
		public static void badMethod() {

		}

	}

//}

