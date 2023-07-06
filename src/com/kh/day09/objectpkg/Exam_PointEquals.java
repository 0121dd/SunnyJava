package com.kh.day09.objectpkg;

class Point1 {
	int x, y;
	public Point1() {}
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) { // 모든 객체
		Point1 p = (Point1)obj; // obj는 부모이기 때문에 다운캐스팅
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return false;
		}
	}
}

public class Exam_PointEquals {
	public static void main(String[] args) {
		Point1 p1 = new Point1(2,3);
		Point1 p2 = new Point1(2,3);
		if(p1.equals(p2)) {
			System.out.println("좌표가 같습니다.");
		}else {
			System.out.println("좌표가 다릅니다.");
		}
		
	}
	// Point클래스에 두점의 좌표가 같으면
	// true를 리턴하는 equals()를 작성하고
	// 2,3 포인트 객체와 2,3 포인트 객체가
	// 같은지 출력하시오.
	// 같을 때 출력 메시지
	// 좌표가 같습니다.
	// 다를 때 출력 메시지
	// 좌표가 다릅니다.
}
