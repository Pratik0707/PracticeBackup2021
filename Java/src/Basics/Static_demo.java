package Basics;

public class Static_demo {

	public static void main(String[] args) {
		dd.m2();//directly call static method without object
		System.out.println(dd.c);
		dd obj = new dd();
		obj.m2();//static method and variables can be access with class object 
		System.out.println(obj.c);		
	}

	static int i=10;

	static void m1()
	{
		System.out.println("Static_demo's static method");
	}
}

class dd
{
	static char c = 'a';

	static void m2()
	{
		System.out.println("dd's m2 method");
	}	
}