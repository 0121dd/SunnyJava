package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		int [][]dimNum = new int[5][5];
		
//		System.out.println(dimNum[0].length); // 5
//		int k = 5;
//		for(int i = 0; i < dimNum[0].length; i++) {
//			dimNum[0][i] = k;
//			k--;
//			System.out.print(dimNum[0][i]+" ");
//		}
//		System.out.println();
//		int d = 10;
//		for(int i = 0; i < dimNum[1].length; i++) {
//			dimNum[1][i] = d;
//			d--;
//			System.out.print(dimNum[1][i]+" ");
//		}
		
		for(int j = 0; j < dimNum.length; j++) {
			int a = dimNum[j].length * (j+1);
			for(int i = 0; i < dimNum[j].length; i++) {
				dimNum[j][i] = a;
				a--;
				System.out.print(dimNum[j][i]+" ");
			}
			System.out.println();
		}
		/* 1행
		dimNum[0][0] = 5;
		dimNum[0][1] = 4;
		dimNum[0][2] = 3;
		dimNum[0][3] = 2;
		dimNum[0][4] = 1;
		//2행
		dimNum[1][0] = 10;
		dimNum[1][1] = 9;
		dimNum[1][2] = 8;
		dimNum[1][3] = 7;
		dimNum[1][4] = 6;
		*/
	}
	public void exercise2() {
		
	}
	public void exercise3() {
		int [][]dimNum = new int[5][5];
		int a = 1;
		for(int j = 0; j < dimNum.length; j++) {
			for(int i = 0; i < dimNum.length; i++) {
				dimNum[i][j] = a;
				a++;
				System.out.print(dimNum[j][i] + " ");
			}
			System.out.println();
		}
		/* 1행
		dimNum[0][0] = 1;
		dimNum[1][0] = 2;
		dimNum[2][0] = 3;
		dimNum[3][0] = 4;
		dimNum[4][0] = 5;
		//2행
		dimNum[0][1] = 6;
		dimNum[1][1] = 7;
		dimNum[2][1] = 8;
		dimNum[3][1] = 9;
		dimNum[4][1] = 10;
		*/
	}
	public void exercise4() {
		
	}
	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3, 3.4), (3.5, 3.6), (3.7, 4.0), (4.1, 4.2)
		double [][] score =  {{3.3, 3.4},{3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		/*
		score[0][0] = 3.3;
		score[0][1] = 3.4;
		
		score[1][0] = 3.5;
		score[1][1] = 3.6;
		
		score[2][0] = 3.7;
		score[2][1] = 4.0;
		
		score[3][0] = 4.1;
		score[3][1] = 4.2;
		*/
		double sum = 0;
		for(int k = 0; k < score.length; k++) { 
			for(int h = 0; h < score[k].length; h++) {
				System.out.printf("%2.1f ", score[k][h]);
				sum += score[k][h];
			}
			System.out.println();
		}
		
		
	}
	
}
