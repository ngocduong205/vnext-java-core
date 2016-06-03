package vn.ngocke.javacore.day6;

public abstract class Bike {
	
	Bike(){
		System.out.println("Bike is created");	
	}

	abstract void run();
	
	void defautl(){
		System.out.println("Defautl");
	}
}
