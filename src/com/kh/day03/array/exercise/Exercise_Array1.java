package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {

	public void exercise1() {
		//양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		
		int [] nums = new int[5];
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
	}
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라. (단, 배열의 크기는 5이다.)
		int [] arrs = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
		}
		
		// 배열에 저장된 값을 이용하여 평균구하기!
		// for, arrs.length, typeTrans, 누적합
		int sum = 0;
		for(int j = 0; j < arrs.length; j++) { 
			sum += arrs[j];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
		
	}
	public void arrayCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1******
		// 2301026-1231515 -> 231026-1******
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요.");
		String memberNum = sc.next();
		for(int i = 0; i < origin.length; i++) {
			origin [i] = memberNum.charAt(i);
		}
		char [] copy = new char[14]; // 깊은 복사의 시작!
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i]; // 성별자리 전까지 차례대로 값을 대입
			}else {
				copy[i] = '*'; // 성별자리 이후엔 *로 값 대입
			}
		}
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
	}
	// 끝판왕 ^^
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		Random rand = new Random();
		int [] num = new int[6]; 
		int temp = 0;
		int count = 1;
		for(int i = 0; i < num.length; i++) {
			// 랜덤으로 숫자 6개 추출 후 배열에 넣기
			num[i] = rand.nextInt(45)+1;
			// 중복제거
			for(int k = 0; k < count; k++) {
				if(num[k] == num[i]) {
					// 다시 뽑기
					i--;
					break;
				}
			}
			count++;
//			System.out.println(num[i]);
		}
		for(int j = 0; j < num.length-1; j++) {
			if(num[j] > num[j+1]) {
				// 
				temp = num[j]; 
				num[j] = num[j+1];
				num[j+1] = temp;
			}
		}
//		if(num[0] > num[1]) {
//			temp = num[0]; 
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		if(num[1] > num[2]) {
//			temp = num[1]; 
//			num[1] = num[2];
//			num[2] = temp;
//		}
		
		
	}
	
	
	
}
