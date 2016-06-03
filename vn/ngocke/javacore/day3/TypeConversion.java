package vn.ngocke.javacore.day3;

public class TypeConversion {

	public static void main(String[] args) {
		
		String demo = "234";
		int intDemo = Integer.parseInt(demo);
		
		System.out.println(intDemo);

		
		long longDemo = Long.valueOf(intDemo);
		System.out.println(longDemo);
		
	}

}
