package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String[] args) {
		// 단항 연산자
		int a = 1;
		// a++, ++a -> a = a + 1;
		System.out.println(a++); // 후위연산(나중연산)
		// a가 2인 상태임
		System.out.println(a);
		System.out.println(++a); // 전위연산(먼저연산)
		// a가 3인 상태
		System.out.println(a);
	}
}
