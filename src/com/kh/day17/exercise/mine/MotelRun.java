package com.kh.day17.exercise.mine;

import java.util.Scanner;

public class MotelRun {
	public static void main(String[] args) {
		MotelFunction mf = new MotelFunction();
		Scanner sc = new Scanner(System.in);
		end:
		while(true) {			
			int choice = mf.printMenu();
			switch(choice) {
				case 1 : mf.checkIn();
					break;
				case 2 : mf.checkOut();
					break;
				case 3 : mf.allRoomsView();
					break;
				case 4 : System.out.println("프로그램을 종료합니다.");
					break end;
				default : System.out.println("잘못 선택하셨습니다.");
					
			}
		}
	}

	
}
