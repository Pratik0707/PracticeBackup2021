package Basics;

public class Abstract {
	public static void main(String[] args) {
		lion obj = new lion();//create child class object
		obj.animalSound();//Way to access abstract class's non abstract methods
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
	abstract void animalSound();// Abstract method

	void animalFood()// NON-abstract method of abstract class
	{
		System.out.println("FOOD : method of abstract class");
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
	{		System.out.println("Brown : Lion class method");	
	}
}