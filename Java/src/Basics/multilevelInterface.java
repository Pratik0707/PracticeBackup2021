package Basics;

public class multilevelInterface {

	public static void main(String[] args) {
		classTwo obj = new classTwo();
		obj.one();
		obj.two();
		obj.three();
		obj.four();
		obj.ccone();
		obj.cctwo();

	}

}

interface cc
{
	void ccone();
	void cctwo();
}

interface aa
{
	void one();
	void two();
}

interface bb extends aa
{
	void three();
	void four();
}

class ex extends aa
{
	void one()
	{

	}
	void two()
	{

	}
}


class classTwo implements bb, cc // implement multiple interfaces
{
	public void three()
	{
		System.out.println("three implemented");
	}

	public void four()
	{
		System.out.println("four implemented");
	}

	public void two()
	{
		System.out.println("two implemented");
	}

	public void one()
	{
		System.out.println("one implemnetd");
	}

	@Override
	public void ccone() {
		System.out.println("ccone implemnetd");

	}

	@Override
	public void cctwo() {
		System.out.println("cctwo implemnetd");

	}
}
