package Basics;

public class overriding_method_hiding {

	public static void main(String[] args) {
		Animl.foo(); // prints Animal
		Cat.foo(); // prints Cat

		Animl a = new Animl();
		Animl b = new Cat();
		Cat c = new Cat();
		Animl d = null;

		a.foo(); // should not be done. Prints Animal because the declared type of a is Animal
		b.foo(); // should not be done. Prints Animal because the declared type of b is Animal// in non-static case, it would have printed Cat. Here hiding comes in picture.
		c.foo(); // should not be done. Prints Cat because the declared type of c is Cat
		d.foo(); // should not be done. Prints Animal because the declared type of d is Animal
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