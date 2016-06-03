package vn.ngocke.javacore.demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class SwitchCase {

	private static Scanner scanner;

	public static void main(String[] args) {
		//********* start
		
		int day;
		scanner = new Scanner(System.in);
		
		System.out.println("Set day: ");
		day = scanner.nextInt();
		
		switch (day) {
			case 2:
				System.out.println("monday");
			break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("webnesday");
				break;
		default:
				System.out.println("Demo 2,3,4 stop");
			break;
		}
		
		//********** end
		
		//**********start
		int arrInt[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arrInt[i] = i;
		}
		
		String[] fullName= new String[20];
		fullName[0] = "d";
		
		int[][] as = new int[4][4];
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(0,"sd");
		System.out.println(arrayList);
		
		Random random = new Random();
		int tmp = 0;
		for (int j = 0; j < 10; j++) {
			int x = random.nextInt(j+1);
			tmp = arrInt[x];
			arrInt[x] = arrInt[j];
			arrInt[j] = tmp;
		}
		
		switch (tmp) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one ");		
			break;
		case 2:
			System.out.println("two ");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four ");
			break;
		case 5:
			System.out.println("five ");
			break;
		case 6:
			System.out.println("six ");
			break;
		case 7:
			System.out.println("seven ");
			break;
		case 8:
			System.out.println("eight ");		
			break;
		case 9:
			System.out.println("night ");
			break;
		default:
			System.out.println("no");
			break;
		}
		//********** end
		
	}
}
