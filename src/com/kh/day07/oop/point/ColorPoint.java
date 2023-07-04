package com.kh.day07.oop.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
//		super(); // 생략되어 있다.
	}
	public ColorPoint(int x, int y, String color) {
//		super.x = x; // private이라 접근 불가
//		super.y = y;
		super(x, y); // 부모의 생성자
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color + ", ");
		super.showPoint(); // 부모가 가지고 있는 메소드 사용 가능
	}
}
