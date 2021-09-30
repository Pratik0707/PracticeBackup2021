package Basics;

public class inHeritance {

	int c;
	int inHeritanceVar=55;
	public static void main(String[] args) 
	{
		System.out.println("in Inheritance");
		int a = 10;
		int b = 20;
		int z = a+b;
		child1 obj = new child1();
		inHeritance it = new child1(); // parent's refereance and child's object
		inHeritance it1 = new grandChild1(); //parent's ref. and child's obj
		obj.method1();
		obj.method2();
		grandChild1 ob = new grandChild1();
		ob.method3();
		ob.method2(); // multilevel inheritance > access parent's methods
		ob.method1(); // multilevel inheritance > access grand parent's methods
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
		int method2Var=11;
		System.out.println("method2 : "+c+" accessing parent class variable "+inHeritanceVar);
	}
}

class grandChild1 extends child1
{
	void method3()
	{
		String method3Var="Hii";
		System.out.println("method 3 : "+c);
		System.out.println("grand parent class variable access "+inHeritanceVar);
	}
}
