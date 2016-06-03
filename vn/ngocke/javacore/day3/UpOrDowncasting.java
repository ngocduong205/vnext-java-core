package vn.ngocke.javacore.day3;


class Monster{
	public void eat(){
		System.out.println("Eat something");
	}
}

class Dargon extends Monster{
	public void fly() {
		System.out.println("Dargon can fly");
	}
}

public class UpOrDowncasting {

	public static void main(String[] args) {
		// Upcasting
		System.out.println("----Upcasting----");
		Dargon dargon = new Dargon();
		Monster monster = dargon;
		Monster monster2 = (Monster)dargon;
		
		dargon.eat();
		dargon.fly();
		monster.eat();
		monster2.eat();
		
		// Downcasting
		System.out.println("----Downcasting----");
		Monster monster3 = new Dargon();
		Dargon dargon2 = (Dargon)monster3;
		dargon2.fly();
		
		String string = "Feed";
		
	}

}
