package vn.ngocke.javacore.demo;

public class Enum {
	enum Season {
		WINTER("dong"), SPRING("xuan"), SUMMER("he"), FALL("thu");
		
		private String value;
		private Season(String value) {
			this.value = value;
		}
	}
	
	
	public static void main(String[] args) {
		
		Season season =  Season.FALL;
		
//		if (season == Season.SUMMER) {
//			System.out.println("ok");
//		}else {
//			System.out.println("no");
//		}
		
		
//		switch (season) {
//		case SUMMER:
//			System.out.println("he");
//			break;
//		case SPRING:
//			System.out.println("xuan");		
//			break;
//		case WINTER:
//			System.out.println("dong");
//			break;
//		default:
//			System.out.println("thu");
//			break;
//		}
		
		
		Season[] arrSeason = Season.values();
		for (Season ss: arrSeason) {
			System.out.println("season: "+ ss + " " + ss.value);
		}
	}
	
}
