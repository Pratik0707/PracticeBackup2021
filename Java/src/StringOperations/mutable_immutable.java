package StringOperations;

public class mutable_immutable {

	public static void main(String[] args) {
		//		String s1 = new String("pratik");
		//		String s2 = s1.toLowerCase();
		//		String s3 = s1.toUpperCase();		
		//		System.out.println(s1==s2);//true
		//		System.out.println(s1==s3);//false
		//
		//		String ss1 = new String("Pratik");
		//		ss1.concat("Hello");// a new object wil be created since string is immutable. 
		//		// and that object has no reference, it is eligible for garbage collection
		//		System.out.println(ss1);//o/p : Pratik
		//
		//		StringBuffer sb = new StringBuffer("PratiK");
		//		sb.append("hii");// existing object will be modified because StringBuffer 
		//		// is mutable
		//		System.out.println(sb);//o/p : PratiKhii
		//
		//		String cs1 = new String("java");//new object created with content "java"
		//		String cs2 = new String("java");//new object created with content "java"
		//		System.out.println(cs1.equals(cs2));//true: both object contains exactly same content
		//		System.out.println(cs1==cs2);//false since cs1 and cs2 are not pointing to same 
		//		//object. There are 2 different objects		
		//		StringBuffer cb1 = new StringBuffer("java");//new object created with content "java"
		//		StringBuffer cb2 = new StringBuffer("java");//new object created with content "java"
		//		System.out.println(cb1.equals(cb2));//false: both references are not pointing to same object
		//		System.out.println(cb1==cb2);//false since cs1 and cs2 are not pointing to same 
		//		//object. There are 2 different objects		
		//
		//		String str = new String("java");// one object in heap and one object in SCP
		//		String str2 = new String("java");// one object in heap and SCP object re-used
		//		String str3 = "java";//SCP object re-used
		//		String str4 = "java";//scp object re-used
		//		// here totally 3 objects created 2 in Heap and 1 in SCP	
		//
		//		String s = new String("java");
		//		s.concat("world");
		//		s=s.concat("Planet");

String s1 = new String("you can not change me");
String s2 = new String("you can not change me");
System.out.println(s1==s2);//false

String s3 ="you can not change me";
System.out.println(s1==s3);//false

String s4 ="you can not change me";
System.out.println(s3==s4);//true

String s5 ="you can not" + "change me";//both are strings 
//i.e. constants then compiler at compile time perform this 
//addition. After compilation, it looks like a single line, so 
//it is exactly same as s3 and s5
System.out.println(s4==s5);//true

String s6 = "you can not";
String s7 = s6+"change me";// here one variable + one constant 
//this operation will be performed at runtime not compile time  
System.out.println(s4==s7);//false

final String s8 = "you can not";//final means constant
String s9 = s8+"change me";//this + will be performed at 
//compile time because both are constants, so it is like s3 and s5
System.out.println(s4==s9);// true




















	}
}
