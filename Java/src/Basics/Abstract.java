package Basics;

public class Abstract {

	public static void main(String[] args) {
		lion obj = new lion();
		obj.animalSound();
		obj.animalColor();
		obj.animalFood();
	}
}

abstract class animal
{
	animal()
	{
		System.out.println("abstract class constructor");
	}
	
	abstract void animalSound();

	void animalFood()
	{
		System.out.println("FOOD");
	}

}

class lion extends animal
{
	lion()
	{
		System.out.println("Lion class constructor");
	}
	void animalSound()
	{
		System.out.println("Roar");
	}

	void animalColor()
	{
		System.out.println("Brown");
	}
}