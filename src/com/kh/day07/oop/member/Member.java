package com.kh.day07.oop.member;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	public Member() { // 생성자
		
	}
	// 오버로딩(메소드의 이름이 같지만 타입이나 개수가 다름)
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	// getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	// setter 메소드
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
}
