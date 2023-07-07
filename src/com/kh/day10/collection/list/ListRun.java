package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
	}
	
	public void sListExample() {
		List<String> strList = new ArrayList<String>();
//		ArrayList<String> aList = new ArrayList<String>();
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 : " + strList.get(i));
		}
		
		System.out.println("==================");
		strList.add(2, "체리");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 : " + strList.get(i));
		}
		System.out.println("==================");
		strList.add(2, "파인애플");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 : " + strList.get(i));
		}
		System.out.println("==================");
		strList.remove(2);
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 : " + strList.get(i));
		}
		
	}
	
	public void genericExample() {		
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);
	}
	
	public void objectExample() {		
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
		Object obj = objList.get(0); // 업캐스팅
		
		int num = (int)obj; // 다운캐스팅
		// Type mismatch: cannot convert from Object to int
		
		Object obj2 = objList.get(1);
		String str = (String)obj2; // 다운캐스팅
		// Type mismatch: cannot convert from Object to String
		
		char cOne = (char)objList.get(2); // 다운캐스팅
		// Type mismatch: cannot convert from Object to char
	}
	
	public void intExample() {		
		IntList nums = new IntList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		int result1 = nums.get(0);
		System.out.println("result1 : " + result1);
		
		int size = nums.size();
		System.out.println("size : " + size);
		
		nums.clear();
	}
	
}
