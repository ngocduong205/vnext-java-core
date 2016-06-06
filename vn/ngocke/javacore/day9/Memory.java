package vn.ngocke.javacore.day9;

public class Memory {

	public static void main(String[] args) {
		
		int i = 1;
		Object obj = new Object();
		Memory mem = new Memory();
		mem.foo(obj);
		
	}

	private void foo(Object obj){
		String string = obj.toString();
		System.out.println(string);
	}
	
}
