package vn.ngocke.javacore.day6;

public class Manager implements Plan,Health {

	@Override
	public void morning() {
		System.out.println("Good morning, I'm manager");
	}

	@Override
	public void sayNo() {
		System.out.println("Say no: beer, sleeping in the making");
	}

	@Override
	public void people(int num) {
		System.out.println( num + " Employee, Partners ... ");
	}

	@Override
	public void eatMeat(int num) {
		if (num > 3) {
			System.out.println("Not good");
		} else {
			System.out.println("Good");
		}
	}

	@Override
	public void eatFish(int num) {
		if (num > 2 && num < 6) {
			System.out.println("good");
		} else {
			System.out.println("Not good");
		}
	}
	
}
