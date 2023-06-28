package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for(;;) {}
		// while(true) {}
		int count = 0;
		for(;;) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char cal = sc.next().charAt(0);
			int result = 0;
			
			switch(cal) {
			case '+' : result =  num1 + num2;
			break;
			case '-' : result =  num1 - num2;
			break;
			case '/' : result =  num1 / num2;
			break;
			case '*' : result =  num1 * num2;
			break;
			case '%' : result =  num1 % num2;
			break;
			
			}
			System.out.println(num1 + " " + cal + " " + num2 + " = " + result);
			count++;
			if(count == 3) break;
		}
		
		
		
	}

}
