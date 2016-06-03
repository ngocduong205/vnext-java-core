package vn.ngocke.javacore.day5;

public class DemoInnerClass {
	
	private String name = "My is InnerClass";
	private String local = "My is Local InnerClass";
	
	public void showAll() {
		MyInner inner = new MyInner();
		inner.showName();
	}
	
	// inner class
	class MyInner{
		public void showName(){
			System.out.println("Name: " + name);
			
		}
	}
	
	// local inner class
	
	public void detailStudent() {
		class LocalInner{
			public void detailName() {
				System.out.println("Name detail: " + local);
			}
		}
	}
}
