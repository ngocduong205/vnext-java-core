package vn.ngocke.javacore.day6;

class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Ready run");
	}
	
}

public class TestAbstract {

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		obj.defautl();
	}

}
