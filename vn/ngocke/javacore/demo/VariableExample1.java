package vn.ngocke.javacore.demo;

public class VariableExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		int a = 10;
		println("int a= " + a);
		
		double b= 100f;
		println("double b= "+ b);
		
		float c = 10.2f;
		println("float c= "+ c);
	
		int d = 23;
		
		println("Max " + Math.min(a, d) );
	}
	
	public static void println(Object line) {
		
		System.out.println(line.toString());
	}

}
