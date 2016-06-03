package vn.ngocke.javacore.day5;

public class Dog {

	private String breed;
	private String name;
	private String color;

	public Dog() {
	}

	public Dog(String breed, String name, String color) {
		this.breed = breed;
		this.name = name;
		this.color = color;
	}

	
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", color=" + color + "]";
	}

	
	
}
