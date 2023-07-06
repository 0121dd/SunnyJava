package com.kh.day09.objectpkg;

// 별개의 파일이라고 봐야 함. 새로 클래스 파일을 만든 것과 같음.
// 다른 점 : public이 붙냐 안붙냐
class Point {
	private int x, y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 눈으로 보이지 않는 것을 보려할때 많이 사용
	@Override
	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
	}
}

public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	
	public static void main(String[] args) {
//		Point p = new Point(2,3);
//		Point p2 = new Point(4,5);
//		print(p);
//		print(p2);
		
		// Object 클래스의 equals()	 메소드 : 내용비교
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java"); // "다릅니다." (주소가 달라져서)
		String [] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
//		if(javaStr == Java) {
//		if(javaStr == javaStr2) {
		if(javaStr.equals(javaStr3)) { // .equals를 쓰면 "같습니다."
//		if(strArrs[0] == strArrs[1]) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
