package Basics;

public class inheritance_overloading {

	int c;
	int inHeritanceVar=55;
	public static void main(String[] args) 
	{
		System.out.println("in Inheritance");
		int a = 10;
		int b = 20;
		int z = a+b;
		child1 obj = new child1();
		inheritance_overloading it = new child1(); // parent's reference and child's object
		inheritance_overloading it1 = new grandChild1(); //parent's ref. and child's obj
		it.method1();//parent class reference can't access child class members and methods. So here we can access only method1
		it1.method1();//Parent class object has access to only parent methods. parent class reference can't access child class members and methods;
		obj.method1();//child class object has access to child + parent members(variables) and methods.
		obj.method2();
		System.out.println(obj.i +" "+obj.inHeritanceVar);
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

class child1 extends inheritance_overloading
{
	int i=55;
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
