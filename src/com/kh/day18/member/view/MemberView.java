package com.kh.day18.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.controller.MemberController;
import com.kh.day18.member.model.vo.Member;

public class MemberView {
	
	MemberController controller;
	
	public void startMemberProgram() {
		controller = new MemberController();
		Member mOne = null;
		String name = "";
		int index = -1; // null
		while(true) {
			int choice = this.printMene();
			finish:
			switch(choice) {
				case 1 : 
					mOne = this.inputMember();
					controller.addMember(mOne);
					break;
				case 2 : 
					name = this.inputMemberName();
					index = controller.findIndexByName(name);
					mOne = controller.findOneByName(name);
					if(index != -1) {
						mOne = this.modifyMember(mOne);
					}
					controller.modifyMember(index, mOne);
					break;
				case 3 : 
					// 삭제할 데이터의 이름을 입력 받음.
					name = this.inputMemberName();
					index = controller.findIndexByName(name);
					controller.subMember(index); // 삭제하기
					break;
				case 4 : 
					name = this.inputMemberName();
					Member member = controller.findOneByName(name);
					this.printOneMember(member);
					break;
				case 5 : 
					this.printAllMembers(controller.allMemberList());
					break;
				case 6 : break finish;
			}
		}
	}
	
	public int printMene() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 회원 관리 프로그램	========");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원 정보 입력 ====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
		return member;
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String memberName = sc.next();
		return memberName;
	}
	
	public void printOneMember(Member member) {
		System.out.println("===== 회원 정보 출력(이름) =====");
		System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
						, member.getMemberId()
						, member.getMemberName()
						, member.getMemberEmail()
						, member.getMemberPhone());
	}
	
	public void printAllMembers(List<Member> mList) {
		System.out.println("===== 회원 전체 정보 출력 =====");
		for(Member member : mList) {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
							, member.getMemberId()
							, member.getMemberName()
							, member.getMemberEmail()
							, member.getMemberPhone());
		}
	}

	public Member modifyMember(Member mOne) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member member = new Member(mOne.getMemberId(), mOne.getMemberPw(), mOne.getMemberName(), memberEmail, memberPhone);
		return member;
	}

}
