package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member [] memArrs;
	private int index;
	
	public MemberFunction() {
		memArrs = new Member[3];
		index = 0;
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원관리 프로그램 ====");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원정보입력 ====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); // 개행 제거
		String address = sc.nextLine();
		memArrs[index] = new Member(memberId, memberPw, email, address);
		index++;
	}
	
	public void printMember() {
		System.out.println("==== 회원정보출력 ====");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.\n",
								memArrs[i].getMemberId(),
								memArrs[i].getMemberPw(),
								memArrs[i].getMemberEmail(),
								memArrs[i].getMemberAddress());
		}
	}
}
