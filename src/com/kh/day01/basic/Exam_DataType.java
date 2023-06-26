package com.kh.day01.basic;

public class Exam_DataType {
	public static void main(String[] args) {
		// 기본형
		//boolean 1byte// char 2byte// byte 1byte, short 2byte, int 4byte, long 
		// float 4byte, doulble 8byte
		// 참조형
		//String
		
		boolean result = true;
		char fChar = 'a';
		
		String sStr = "Hello Java";
		// 정수 part
		byte bNum = 127; // 128은 안됨
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 21474836481l; // 접미사 l을 붙여야 함.
		
		// 실수 part
		float fNum = 2030626f;  // 접미사 f를 붙여야 함.
		double dNum = 23.1026;
		
	}
}
