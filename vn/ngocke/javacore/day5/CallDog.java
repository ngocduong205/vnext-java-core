package vn.ngocke.javacore.day5;


abstract class Say{
	 abstract void sayAll();
}

public class CallDog {
	
	public static void main(String[] args) {
		// Demo call Dog
//		Dog dog = new Dog("BecZe", "Chelsea", "Red");
//		System.out.println(dog.toString());
		
		// Demo call Student
		Student st = new Student();
		st.setId(10);
		st.setName("Ngoc");
		st.setAge(16);
		st.setAddress("HaGiang");
		
		System.out.println("Id: " + st.getId() + ", Name: " + st.getName() + ", Address: " + st.getAddress());
		
		Student st2 = new Student(12, "Hung", 23, "HaiDuong");
		System.out.println(st2.getAddress());
		System.out.println(st2.Lop);
		
		
		// demo Inner
		/// Call InnerClass
		DemoInnerClass inner = new DemoInnerClass();
		inner.showAll();
	
		DemoInnerClass.MyInner innerCall = new DemoInnerClass().new MyInner();
		innerCall.showName();
		
		inner.detailStudent();
		
		// Demo Anonymous Inner class
		
		Say say = new Say() {
			
			@Override
			void sayAll() {
				System.out.println("Hello All, I'm Anonymous Inner Class");		
			}
		};
		
		say.sayAll();
		
	} 
}
