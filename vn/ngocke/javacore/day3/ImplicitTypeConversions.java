package vn.ngocke.javacore.day3;

public class ImplicitTypeConversions {

	public static void main(String[] args) {
		
		int a = 100;
		long b = a;
		double c = a;
		System.out.println("long: "+b);
		System.out.println("double: "+c);
	}
}
