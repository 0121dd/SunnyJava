package com.kh.day10.collection.student;

public class StudentRun {
	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		end:
		while(true) {
			// 메뉴 출력
			// 메뉴 선택
			int choice = sFunc.printMenu();
			
			// 메뉴에 따라 기능 구현
			switch(choice) {
			case 1 : sFunc.inputInfo();
				break;
			case 2 : sFunc.searchInfoByName();
				break;
			case 3 : sFunc.checkPassd();
				break;
			case 4 : sFunc.checkPassd();
				break;
			case 5 : System.out.println("프로그램이 종료되었습니다.");
				break end;
			}
		}
	}

	
}
