package Basics;
public class overriding_method_hiding {

	public static void main(String[] args) {
		child.add(10, 5);//child class's add wil be called
		overriding_method_hiding.add(2, 2);//overriding_method_hiding(i.e. parent) clas's method wil b called
	}

	static void add(int a, int b)
	{
		int f = a+b;
		System.out.println("add of parent, Additipn of two nu,bers : "+f);
	}
}
class child extends overriding_method_hiding
{
	static void add(int d, int e)
	{
		int f1 = d+e;
		System.out.println("add of child, Additipn of two numbers : "+f1);
	}
}
