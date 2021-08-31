package Basics;

public class inHeritance {

	int c;
	public static void main(String[] args) 
	{
		System.out.println("in Inheritance");
		int a = 10;
		int b = 20;
		int z = a+b;
		child1 obj = new child1();
		obj.method1();
		obj.method2();
		grandChild1 ob = new grandChild1();
		ob.method3();
		ob.method2(); // multilevel inheritance
		ob.method1(); // multilevel inheritance
	}

	public void method1()
	{
		System.out.println("method1 : "+c);
	}
}

class child1 extends inHeritance
{
	void method2()
	{
		System.out.println("method2 : "+c);
	}
}

class grandChild1 extends child1
{
	void method3()
	{
		System.out.println("method 3 : "+c);
	}
}
