package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		for(int k = 0; k < 24; k++) {
			for(int i = 0; i < 60; i++) {
				System.out.printf("%2d시 %2d분\n", k, i);
			}
		}
	}

}
