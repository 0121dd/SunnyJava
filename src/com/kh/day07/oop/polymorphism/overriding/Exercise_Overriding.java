package com.kh.day07.oop.polymorphism.overriding;

class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}
class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	// overriding되어 있어서 부모가 출력이 되는게 아니라
	// 자식이 출력된다.
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}

}
