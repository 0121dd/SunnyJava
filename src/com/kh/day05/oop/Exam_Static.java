package com.kh.day05.oop;

class StaticSample {
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	
	public void goodMethod() {
		
	}
	
	public static void originMethod() {
		input = 1225;
	}
}

public class Exam_Static {

	public static void main(String[] args) {
		
		// 객체를 생성하기도 전에 사용가능
		StaticSample.input = 10;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);

		StaticSample sample = new StaticSample();
		sample.num = 26;
	}

}
