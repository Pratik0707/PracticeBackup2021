package Basics;
import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		demo1 d = new demo1();
		d.divide();

		try
		{
			demo2 d2 = new demo2();
			d2.divide2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught ArithmeticException");
			System.out.println(e);
		}		
		catch (NullPointerException n)
		{
			System.out.println("caught NullPointerException");
		}
	}
}

class demo1
{
	void divide() throws ArithmeticException
	{
		System.out.println("Enter a number 1 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter another number : ");
		int b = sc.nextInt();
		int c = 0;
		try 
		{
			c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("Can't divide ");
			System.out.println(e);
		}
		finally
		{
			System.out.println("In finally");
		}
		System.out.println("Division is : "+c);
	}
}

class demo2
{
	void divide2() throws ArithmeticException, NullPointerException
	{
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		System.out.println("Enter another number : ");
		int w= sc.nextInt();
		int e = q/w;
		System.out.println("Divisionresult : "+e);
	}
}



















