package Basics;

public class LambdaExpression_parametarized {
	public static void main(String[] args) {
		//Way 1 : continuation 
		//		cab cc = new Uber();
		//		cc.bookCab();

		//Way 2 to use interface is to write anonymous innerclass : 
		//		cab cc = new cab()
		//		{
		//			@Override
		//			public void bookCab() 
		//			{
		//				System.out.println("Booked cab in ananymous inerClass");
		//			}
		//		};
		//		cc.bookCab();

		//		Way 3 to use functional interfaces >>>> Lambda expression 
		Cabb cc = (Source, Destination, Amount) ->
		{
			System.out.println("Booked cab in lambda expression");
			System.out.println("Source : "+Source+" Destination : "+Destination+" Amount : "+Amount);
			return Amount+10;
		};
		int i=cc.bookCab("Pune", "Mumbai", 1050);
		System.out.println("Lambda expression returned : "+i);
	}
}
@FunctionalInterface
interface Cabb //functional interface possess only one method
{
	int bookCab(String source, String Destination, int charges);
}

// way 1 to use interface is to implement it by a class : 
//class Uber implements cab
//{
//	public void bookCab()
//	{
//		System.out.println("booked cab");
//	}
//}






