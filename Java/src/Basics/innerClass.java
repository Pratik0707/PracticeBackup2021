package Basics;
public class innerClass {

	public static void main(String[] args) {
		outer or = new outer();// outer class object creation
		or.m1();//call outer class mthd with outer class obj
//		or.inner_m2();  >>> IMP we cant use outer obj to call inner class method/variable
		outer.inner in = or.new inner();//inner class object creation
		in.inner_m2();//call inner class mthd using inner class obj
//		in.m1();  >>> IMP we cant use inner class obj to call outer class mthd.
//		System.out.println(in.i);//cant acces outer variable with inner object
	}
}
class outer
{
	int i=10;
	void m1()
	{
		System.out.println("outer class method");
	}

	class inner
	{
		int innerVar = 11;
		void inner_m2()
		{
			System.out.println("inner class method"+i);
		}//above used outer class varible in inner clas
	}
}