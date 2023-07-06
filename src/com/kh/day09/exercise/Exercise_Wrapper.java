package com.kh.day09.exercise;

public class Exercise_Wrapper {
	public static void main(String[] args) {
		// "20230515"와 "231026"인 문자열을
		// 계산해서 출력하시오
		String date1 = "20230515";
		String date2 = "20231026";
		int result = Integer.parseInt(date1) + Integer.parseInt(date2);
		System.out.println("결과 : " + result);
	}
}
