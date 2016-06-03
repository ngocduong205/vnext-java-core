package vn.ngocke.javacore.day8;

public class TestPolymorphism {

	public static void main(String[] args) {
		// Test Overloading
		Polymorphism objOverloading = new Polymorphism();
		printlt(objOverloading.say());
		printlt(objOverloading.say("Ngoc Ke"));
		
		// Test Overriding
		Polymorphism objOverriding = new Overriding();
		printlt(objOverriding.say());
		printlt(objOverriding.say("Ke"));
		
	}

	public static void printlt(String out){
		System.out.println(out);
	}
	
}
