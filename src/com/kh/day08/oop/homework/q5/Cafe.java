package com.kh.day08.oop.homework.q5;

abstract public class Cafe {
	
	String shopName;
	
	public Cafe() {}
	public Cafe(String shopName) {
		this.shopName = shopName;
	}
	
	abstract public void makeCoffee(int money);
//	{
//		if(money == 4000) {
//			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
//		}else if(money == 4500) {
//			System.out.println("주문하신 아이스 라떼 한잔 나왔습니다.");
//		}
//	}
}
