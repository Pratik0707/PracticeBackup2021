package Basics;

public class Static {

	public static void main(String[] args) {
		// static int a=10; cann not have static variable inside static methood
		demo1();// static, called without object
		Static st = new Static();
		st.demo1('p');// static method overloading
		st.demo1(10);// static method overloading
		st.nonStatic();// need object to call non static method
		System.out.println(i);// access static variable directly
		//	System.out.println(r);// cannot access non-static variable directly

	}
	static int i=10;
	static void demo1()
	{
		char r = 'p';
		i++;
		System.out.println("Changed static var val : "+i);
	}

	void nonStatic()
	{
		System.out.println("static var in non static method "+i++);
	}

	static void demo1(int i)
	{
		System.out.println(i);
	}

	static void demo1(char c)
	{
		System.out.println(c);
	}

}
