package Basics;

public class polymorphysm_overloading {

	public static void main(String[] args) {
		polymorphysm_overloading obj = new polymorphysm_overloading();
		obj.sum(10,20);
		obj.sum(11,22, 33);
		obj.sum(1, 2, 3, 4);
	}

	void sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}

	void sum (int a, int b, int x)
	{
		int q = a+b+x;
		System.out.println(q);
	}

	int sum (int a, int b, int x, int y)
	{
		int q = a+b+x+y;
		System.out.println(q);
		return q;
	}

}

