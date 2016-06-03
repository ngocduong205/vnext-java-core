package vn.ngocke.javacore.day7;

class Say{
	String sayHello = "hi Guys";
}

class Write extends Say{
	String sayHello = "This my Write file";
	
	void display(){
		System.out.println("Say: " + super.sayHello);
	}
}

public class SuperAndSub {
	public static void main(String args[]) {
		Write obj = new Write();
		obj.display();
	}
}
