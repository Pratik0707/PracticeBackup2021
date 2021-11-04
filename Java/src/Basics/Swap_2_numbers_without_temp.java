package Basics;
// WAP to swap two numbers without using temp variable.
public class Swap_2_numbers_without_temp {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
	}
}

