package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정숴를 0으로 나누는 경우에"0으로나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		// for(;;) {}
		// while(true) {}
		
		while(true) {
			// 1. num1 cannot be resolved to a variable
//			int num1, num2;
			// 2. the local variable num1 may not have been initialized
//			num1 = 0;
//			num2 = 0;
			// 멀티 catch절
			try {
				System.out.print("정수 하나 입력: ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력: ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.\n", num1, num2, result);
			}catch(ArithmeticException e) { // 변수 써줘야 한다!
				System.out.println("0으로 나눌 수 없습니다!");
			}catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨어요? 정수 입력해주세요.");
				sc.next();
			}
		}
		
	}
	
	public void exercise2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를
		// 처리하여 다시 입력받도록 하여라.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int num2  = sc.nextInt();
			System.out.print("세번째 정수 입력 : ");
			int num3 = sc.nextInt();
			try {
				int result = num1 + num2 + num3;
				System.out.printf("%d, %d, %d의 합은 %d입니다.\n", num1, num2, num3, result);
			}catch(InputMismatchException e) {
				System.out.println("잘못입력했습니다. 정수만 입력해주세요.");
			}
			
		}
	}
	
	public void exercise3() {
		// 범위를 벗어난 배열의 접근
		int [] intArrs = new int[5];
		try {
			System.out.println(intArrs[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인데스가 범위를 벗어났습니다.");
		}
		
		
	}
	
	public void exercise4() {
		// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		// (NumberFormatException)
		String [] str = new String[2];
		str[0] = "1026";
		str[1] = "5.15";
		// String -> int
		try {
			int result = Integer.parseInt(str[0]);
			System.out.printf("숫자로 변환된 값은 %d\n", result);
			int check = Integer.parseInt(str[1]);
			System.out.printf("숫자로 변환된 값은 %d\n", check);
		} catch (NumberFormatException e) {
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}
		
		
	}
	
	
}
