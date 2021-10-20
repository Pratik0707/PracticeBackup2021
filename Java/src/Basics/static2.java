package Basics;

public class static2 {

	//static int count=0;
	int count=0;
	
	static2()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		static2 s1 = new static2();
		static2 s2 = new static2();
		static2 s3 = new static2();
	}

}


