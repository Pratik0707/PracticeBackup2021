package Basics;

public class Static {

	public static void main(String[] args) {
		// static int a=10; cann not have static variable inside static methood
		demo1();// static, called without object
		Static st = new Static();
		st.nonStatic();// need object to call non static method
		System.out.println(i);// access static variable directly
		System.out.println(r);// cannot access non-static variable directly

	}
	static int i=0;
	static void demo1()
	{
		char r = 'p';

	}

	void nonStatic()
	{

	}

}
