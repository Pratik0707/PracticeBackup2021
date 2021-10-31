package Basics;

public class anonymous_innerclass_with_abstractClass {
	public static void main(String[] args) {
		cls cc = new cls()//anonymous inner class
				{
			@Override
			void mthd() 
			{
				System.out.println("implementation for abstact class method");
			}
			public void mthd_ano() 
			{
				System.out.println("anonymous class's own method");
			}
				};
cc.mthd2();
cc.mthd();//calling abstract class's non-abstract method
cc.mthd_ano();//trying to access anonymous inner class's local method 
	}
}
abstract class cls
{
	abstract void mthd();
	void mthd2()
	{
		System.out.println("non abstract method of abstract class");
	}
}