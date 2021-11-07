package Basics;

public class Method_hiding2 {

	public static void main(String[] args) {
		Animl.foo(); // prints Animal
		Cat.foo(); // prints Cat

		Animl a = new Animl();
		Animl b = new Cat();
		Cat c = new Cat();
		Animl d = null;
//in method hiding, it calls method based on the reference not based on the object
		a.foo(); // Prints Animal because the declared type of a is Animal
		b.foo(); // Prints Animal because the declared type of b is Animal// in non-static case, it would have printed Cat. Here hiding comes in picture.
		c.foo(); // Prints Cat because the declared type of c is Cat
		d.foo(); // Prints Animal because the declared type of d is Animal
	}
	static void add(int a, int b)
	{
		int f = a+b;
		System.out.println("add of parent, Additipn of two nu,bers : "+f);
	}
}
class Animl {
	public static void foo() {
		System.out.println("Animal");
	}
}

class Cat extends Animl {
	public static void foo() {  // hides Animal.foo()
		System.out.println("Cat");
	}
}