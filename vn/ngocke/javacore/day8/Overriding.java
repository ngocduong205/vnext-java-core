package vn.ngocke.javacore.day8;

public class Overriding extends Polymorphism {
	
	public String say() {
		return "Hi, this is Overriding";
	}
	

	public String say(String name) {		
		return "Hi, this is Overriding " + name;
	}
	
}
