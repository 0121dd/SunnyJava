package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오.
		String name = "홍길동/장화/홍련/콩쥐/팥쥐";
//		String [] names = name.split("/");
//		System.out.println(names[2]);
		StringTokenizer st = new StringTokenizer(name, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			if(token.equals("홍련")) {
				System.out.println(token);
			}
		}
	}
}
