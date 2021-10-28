package Basics;
// Java do not support static outer class, it can have static inner class only
public class Static_classes {
	public static class prtSt//inner class
	{
		prtSt()//inner class constructor
		{
			System.out.println("Static class constructor");
		}
		void m1()//inner class's method
		{
			System.out.println("in inner static class method m1");
		}
	}

	public static void main(String[] args) {
		Static_classes p = new Static_classes();
		Static_classes.prtSt pstat = new Static_classes.prtSt();
		pstat.m1();//inner class object created above
	}
}
