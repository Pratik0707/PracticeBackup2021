package Basics;

public class singleton_demo {

	public static void main(String[] args) {
		singlet snt1 = singlet.CreateSingletObj();//we get same object with snt1 reference
		singlet snt2 = singlet.CreateSingletObj();//we get same object with snt2 reference
		snt2.demoMethod();// calling method with snt2 reference
	}}

class singlet
{
	private static singlet ss = new singlet();// object of singleton class

	private singlet()// private constructor
	{

	}
	public static singlet CreateSingletObj() //method that returns object
	{
		return ss; //return object of singleton class
	}

	protected static void demoMethod( )  //normal method in singleton class
	{
		System.out.println("demoMethod for singleton");
	}
}
