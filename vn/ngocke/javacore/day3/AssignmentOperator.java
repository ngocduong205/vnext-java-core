package vn.ngocke.javacore.day3;

import java.util.concurrent.SynchronousQueue;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int x = 13;
		int y = 8;
		println(Integer.toBinaryString(x));
		println(Integer.toBinaryString(y));
		println(">>= " + (x<<y));
		
		
//		println("= " + (x+y));
//		println("+= " + (x+=y));
//		println("-= " + (x-=y));
//		println("*= " + (x*=y));
//		println("/= " + (x/=y));
//		println("%= " + (x%=y));
//		println("<<= " + (x<<=y));
//		println(">>= " + (x>>=y));
//		println(">>>= " + (x>>>=y));
		
		// Giong nhau la 1, 0 => 0
//		println("&= " + (x&=y));
		
		//khac nhau =1, giong nhau = 0
//		println("^= " + (x^=y));
		
		// 1 bit la 1 => 1, 2 bit la 0 =>0
//		println("&= " + (x|=y));

	}
	
	public static void println(Object line){
		System.out.println(line);
	}

}
