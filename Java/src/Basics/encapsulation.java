package Basics;

public class encapsulation {

	public static void main(String[] args) {
		bank obj = new bank();
		obj.setBal(100);
		obj.setName("Pratik");

		System.out.println(obj.getBal());
		System.out.println(obj.getName());

	}
}

class bank
{
	private int bal;
	private String name;

	public int setBal(int bl)
	{
		this.bal = bl;
		return bal;
	}

	public String setName(String nm)
	{
		name = nm;
		return name;
	}

	public int getBal()
	{
		return bal;
	}

	public String getName()
	{
		return name;
	}

}