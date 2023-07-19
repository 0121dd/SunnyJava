package com.kh.day17.exercise.mine;

import java.util.Scanner;

public class MotelFunction {
	Motel mt;
	public MotelFunction() {
		mt = new Motel();
	}
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램");
		System.out.println("1. 입실    2. 퇴실    3. 방보기    4.종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	public void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에 입실하시겠습니까?");
		int choiceRoom = sc.nextInt();
		if(0 < choiceRoom && choiceRoom<= 10) {			
			if(mt.rooms[choiceRoom - 1] == 1) {
				System.out.println(choiceRoom + "방은 현재 손님이 있습니다.");
			}else if(mt.rooms[choiceRoom - 1] == 0) {
				mt.rooms[choiceRoom - 1] = 1;
				System.out.println(choiceRoom + "번방에 입실하셨습니다.");
			}
		}else {
			System.out.println("1 ~ 10 중에 입력해주세요.");
			checkIn();
		}
		
	}
	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에서 퇴실하시겠습니까?");
		int choiceRoom = sc.nextInt();
		if(0 < choiceRoom && choiceRoom<= 10) {				
			if(mt.rooms[choiceRoom - 1] == 0) {
				System.out.println(choiceRoom + "방은 현재 빈 방입니다.");
			}else if(mt.rooms[choiceRoom - 1] == 1) {
				mt.rooms[choiceRoom - 1] = 0;
				System.out.println(choiceRoom + "번방에서 퇴실하셨습니다.");
			}
		}else {
			System.out.println("1 ~ 10 중에 입력해주세요.");
			checkOut();
		}
	}
	public void allRoomsView() {
		for(int i = 0; i < mt.rooms.length; i++) {
			if(mt.rooms[i] == 1) {
				System.out.println((i+1) + "번방에는 현재 손님이 있습니다.");
			}else if(mt.rooms[i] == 0) {
				System.out.println((i+1) + "번방이 현재 비어있습니다.");
			}
		}
	}
	
}
