package Basics;

public class singleton_demo2 {

	public static void main(String[] args) {
		singlet2 snt1 = singlet2.CreateSingletObj();//we get same object with snt1 reference
		singlet2 snt2 = singlet2.CreateSingletObj();//we get same object with snt2 reference
		snt2.demoMethod();// calling method with snt2 reference
	}}

class singlet2
{
	private static singlet2 ss = null;// object of singleton class

	private singlet2()// private constructor
	{

	}
	public static singlet2 CreateSingletObj() //method that returns object
	{
		if(ss==null)
		{
			ss=new singlet2();
		}
		return ss; //return object of singleton class
	}
	protected static void demoMethod( )  //normal method in singleton class
	{
		System.out.println("demoMethod for singleton");
	}
}
