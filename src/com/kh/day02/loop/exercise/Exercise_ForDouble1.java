package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {

	public static void main(String[] args) {
		// 구구단 출력
//		for(int k = 2; k < 10; k++) {
//			System.out.println(k + "단");
//			for(int h = 1; h < 10; h++) {
//				System.out.println(k + " * " + h + " = " + k*h);
//			}
//		}
		for(int k = 1; k < 10; k++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " * " + k + " = " + i*k + "	");
			}
			System.out.println("");
		}
		
		
	}
}
