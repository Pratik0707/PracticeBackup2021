package Basics;

public class Palimrom {

	public static void main(String[] args) {
		int r,sum=0,temp;    
		int n=454;//It is the number variable to be checked for palindrome  

		temp=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    

		//// another way : 

		int num1 = 121;
		String ss = Integer.toString(num1);
		StringBuilder sb = new StringBuilder(ss);
		if(ss.equals(sb.reverse()))
		{
			System.out.println("Palimrom");
		}
		else
		{
			System.out.println("not a palimrom");
		}
	}
}
