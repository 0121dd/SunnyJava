package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
//		Calculator calc = new Calculator();
		//Cannot instantiate the type Calculator
		// 추상클래스는 객체 생성 안됨.
		Calculator calc = new GoodCalc(); // 업캐스팅
		int [] a = {1,2,3,4,5};
		System.out.printf("합 : %d\n", calc.add(1, 2));
		System.out.printf("차 : %d\n", calc.substract(4, 3));
		System.out.printf("평균 : %.2f", calc.average(a));
	}

}
