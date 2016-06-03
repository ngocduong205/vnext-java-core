package vn.ngocke.javacore.demo;

public class IfElse {

	public static void main(String[] args) {
		checkNumber(12);
	}
	
	public static void println(Object line) {
		System.out.println(line);
	}
	
	public static void checkNumber(int a) {
		if (a%2 == 0) {
		    println(a + " la so chan!");
		}else{
			println(a + " la so le!");
		}
	}

}
