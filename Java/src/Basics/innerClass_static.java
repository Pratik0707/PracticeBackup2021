package Basics;

import Basics.outer.inner;

public class innerClass_static {

	public static void main(String[] args) {
		outer or = new outer();// outer class object creation
		outer.inner in = or.new inner();//inner class object creation
		in.inner_m2();//call inner class mthd using inner class obj
		
	}
}
class Outer
{
	int i=10;
	void m1()
	{
		System.out.println("outer class method");
	}

	static class inner
	{
		int innerVar = 11;
		void inner_m2()
		{
			//System.out.println("inner class method"+i);
		}//above used outer class varible in inner clas
	}
}