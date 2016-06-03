package vn.ngocke.javacore.day6;

public class Student implements Plan,Health {

	@Override
	public void morning() {
		System.out.println("Good morning, i'm student");
	}

	@Override
	public void sayNo() {
		System.out.println("Say no: game, to be late for school");
	}

	@Override
	public void eatMeat(int num) {
		if (num == 2) {
			System.out.println("ok");
		} else {
			System.out.println("no");
		}
	}

	@Override
	public void eatFish(int num) {
		if (num == 4) {
			System.out.println("ok");
		} else {
			System.out.println("no");
		}
		
	}

	@Override
	public void people(int num) {
		System.out.println(num + " Teacher, Classmate");
	}
	
}
