package oops;


// Parent Class
class Animal {
	void makeSound() {
		System.out.println("Animals make sounds.");
	}
}

// Child Class
class Dog extends Animal {
	// Overriding the makeSound() method
	//@Override
	void makeSound() {
		System.out.println("Dog barks: Woof! Woof!");
	}
}

// Another Child Class
class Cat extends Animal {
	// Overriding the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Cat meows: Meow! Meow!");
	}
}

// Main Class
public class Poly_methodOverriding {


	public static void main(String[] args) {
		//Animal myAnimal = new Animal();
		//myAnimal.makeSound();  // Calls Animal's method

		Dog myDog = new Dog();
		myDog.makeSound();  // Calls Dog's overridden method

		Animal myCat = new Cat();
		myCat.makeSound();  // Calls Cat's overridden method
	}
}







