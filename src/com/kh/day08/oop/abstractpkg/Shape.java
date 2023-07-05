package com.kh.day08.oop.abstractpkg;

// 4. The type Line must implement the inherited abstract method Shape.draw() 
// (추상메소드 오버라이딩 해야함. 안할거면 class에 abstract 붙여야 함)
class Line extends Shape {

	@Override
	public void draw() {
		
	}
}

public abstract class Shape {
	public Shape() {} 
	
	public void paint() {}
	abstract public void draw();
	// 1. Abstract methods do not specify a body (몸체가 없어야 함, {} 없애고 ; 적기)
	// 2. The abstract method draw in type Shape can only be defined by an abstract class (추상클래스로 바꿔야 함)
	// 3. The type Shape must be an abstract class to define abstract methods (추상메소드가 있어서 반드시 추상클래스로 만들어야 함)
	
}
