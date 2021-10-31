package Basics;

public class anonymous_innerclass_with_interface {
	public static void main(String[] args) {
		cls2 cc = new cls2()//anonymous inner class
				{
			@Override
			public void mthd() 
			{
				System.out.println("implementation for abstact method of interface");
			}
				};
				cc.mthd();// anonymous inner class overridden method
				cc.mthd2();//interface's method
	}
}
interface cls2
{
	abstract void mthd();
	default void mthd2()
	{
		System.out.println("non abstract method of interface");
	}
}