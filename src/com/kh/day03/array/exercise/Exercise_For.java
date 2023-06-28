package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void forExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(i < 10) {
				System.out.print(i + "+");
			}else { 
				System.out.print(i);
			}
		}
		System.out.println("=" + sum);
	}
	
	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int dan = sc.nextInt();
		if((dan > 0) && (dan < 10)) {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
	
	public void forDoubleExercise1() {
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
		
	public void forDoubleExercise2() {
		for(int k = 0; k < 24; k++) {
			for(int i = 0; i < 60; i++) {
				System.out.printf("%2d시 %2d분\n", k, i);
			}
		}
	}
	
	public void forDoubleExercise3() {
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
