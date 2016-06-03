package vn.ngocke.javacore.day3;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		if(a||b)
		{}
		System.out.println("a && b: " + (a&&b));
		System.out.println("a || b: " + (a || b));
		System.out.println("!(a || b): " + !(a || b));
	}
}
