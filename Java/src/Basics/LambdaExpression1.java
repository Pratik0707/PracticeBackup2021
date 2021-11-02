package Basics;

public class LambdaExpression1 {
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
		cab cc = () ->
		{
			System.out.println("Booked cab in lambda expression");
		};
		cc.bookCab();
	}
}
@FunctionalInterface
interface cab //functional interface possess only one method
{
	void bookCab();
}

// way 1 to use interface is to implement it by a class : 
//class Uber implements cab
//{
//	public void bookCab()
//	{
//		System.out.println("booked cab");
//	}
//}














