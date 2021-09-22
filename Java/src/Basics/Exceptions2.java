package Basics;

public class Exceptions2 {

	public static void main(String[] args) {

		int a =10;
		int b =0;
		try
		{
			int c = a/b;
			System.out.println(c);
		}				
		catch(Exception e) // IMP : SHOULD ALWAYS BE LAST OTHERWISE BELOW EXCEPTIONS WILL SHOW ERROR AS IT IS SHOWING 
		// BELOW. IF U HAVE MULTIPLE CATCHES THEN THE 1ST APPROPRIATE MATCH WIL BE CHOSEN BY JAVA TO EXECUTE
		// AND (Exception e) GLOBALLY CATCHES all exceptions. so, if we write it first in list, then rest all catch 
		// blocks become unreachable code. because (Exception e) catches all exceptions and control will 
		//never go to remaining catch blocks written after (Exception e)
		{
			System.out.println("Can't divide ");
			System.out.println(e);
		}
		catch(ArithmeticException p) 
		{
			System.out.println("Can't divide ");
			System.out.println(p);
		}
		finally
		{
			System.out.println("In finally");
		}
		
	}

}

