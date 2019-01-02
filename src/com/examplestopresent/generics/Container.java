package com.examplestopresent.generics;

// (Generics : Classes)

// Generics enable types (classes and interfaces) to be parameters when defining classes.
// One of the most significant benefits of utilizing Generics is the ability to initialize a class's type 
// generically.
// Doing this allows our classes to be dynamic, while still benefiting from type safety.
// Compile Time Type Safety is important because it provides visibility of potential errors during compile time,
// instead of crashing our program with potential errors during runtime.
// We're benefitting from type safety when we use the constructors to explicity define how the class 
// will be used.

// Generics are incredibly powerful because we can simply create one Generic Class for however many combinations
// of argument types we want, instead of having to declare a new method for each type of data and
// combinations of data that we want to use.

//(Generics vs Overloading)

//Generics are typically used to create common behavior that can be used for many different classes.
//While Overloading is most commonly used to alter the behavior of a method for a descendant class; 
//a class that extends from a parent class.

// (Generics Classes Example)
// In this example, we initialize our Container class to take two arbitrarily named generic types (i1, and i2).
// When we instantiate a Container in the Examples class, we can specify what i1 and i2 actually are.
// If we want, we can now create several instances of Container, all taking different combinations of argument data
// types, while performing the same logic and maintaing a type safety promise for each.
// -> See Examples.Java

public class Container<i1, i2> {

	i1 item1;
	i2 item2;
	
	public Container(i1 item1, i2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("The contents of this container: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
	}

	public i1 getItem1() {
		return item1;
	}

	public void setItem1(i1 item1) {
		this.item1 = item1;
	}

	public i2 getItem2() {
		return item2;
	}

	public void setItem2(i2 item2) {
		this.item2 = item2;
	}
}
