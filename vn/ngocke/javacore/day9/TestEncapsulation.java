package vn.ngocke.javacore.day9;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("NgocKe");
		emp.setAddress("Ha Giang");
		
	//	println(emp.getId());
		println(emp.getName());
		println(emp.getAddress());
	}
	
	private static void println(Object line) { 
		System.out.println(line);
	}

}
