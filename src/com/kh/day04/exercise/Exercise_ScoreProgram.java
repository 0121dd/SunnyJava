package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int input = sc.nextInt();
			int total = kor + eng + math;
			/*
			if(input == 1) {
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
			}else if(input == 2) {
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + total);
				System.out.println("평균 : " + total / 3);
			}else if(input == 3) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 다시 선택해주세요.");
			}
			*/
			finish :
			switch(input) {
				case 1 :
					System.out.println("====== 성적 입력 ======");
					System.out.print("국어 : ");
					kor = sc.nextInt();
					System.out.print("영어 : ");
					eng = sc.nextInt();
					System.out.print("수학 : ");
					math = sc.nextInt();
					break;
				case 2 :
					System.out.println("====== 성적 출력 ======");
					System.out.println("국어 : " + kor);
					System.out.println("영어 : " + eng);
					System.out.println("수학 : " + math);
					System.out.println("총점 : " + total);
					System.out.println("평균 : " + (double)(total / 3));
					break;
				case 3 :
					System.out.println("종료되었습니다."); 
					break finish;
				default :
					System.out.println("잘못입력하셨습니다. 다시 선택해주세요.");
			}
		}
		
	}
}
