package vn.ngocke.javacore.day6;

public class Test {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.morning();
		st.sayNo();
		st.people(2);
		st.eatFish(3);
		
		System.out.println("****________****");
		
		Manager ma = new Manager();
		ma.morning();
		ma.sayNo();
		ma.people(2);
		ma.eatMeat(4);
	}
}
