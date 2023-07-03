package com.kh.day06.oop.objectarray;

public class Circle {
	int radius; // default 패키지 내에서 접근 가능
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}
	
	
}
