package Basics;

public class anonymous_innerclass_with_concreteClass {
	public static void main(String[] args) {
		concreteClass cc = new concreteClass()//anonymous inner class
				{
			@Override
			public void mthd1() 
			{
				System.out.println("overriden method 1");
			}
			public void mthd2() 
			{
				System.out.println("overriden method 2");
			}
				};
				cc.mthd1();// anonymous inner class overridden method 1
				cc.mthd2();// anonymous inner class overridden method 2
	}
}
class concreteClass
{
	concreteClass()
	{
		System.out.println("concreteClass constructor");
	}
	void mthd1()
	{
		System.out.println("Method1 of concrete class");
	}
	void mthd2()
	{
		System.out.println("Method2 of concrete class");
	}
}