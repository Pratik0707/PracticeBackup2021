package Basics;
import java.util.Scanner;
//WAP to find if given number is prime
//A prime number is a number that is divisible by only two numbers: 1 and itself.
public class prime_numbers {

	public static void main(String[] args) {
		int num = 3;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) 
		{
			// condition for non-prime number
			if (num % i == 0) 
			{
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
