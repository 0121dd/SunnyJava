package com.kh.day01;

public class Hello {
	public static int sum(int num1, int num2 ) {
		//This method must return a result of type int - return 없어서 뜨는 오류
		//메소드 sum  /  매개변수 num1, num2
		return num1 + num2;
		
	}
	public static void main(String[] args) {
		//void 반환값x return 안해도됨.
		int i = 20;
		int s;
		char a;
		
		a = '?';
		s = sum(i, 10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}
}
