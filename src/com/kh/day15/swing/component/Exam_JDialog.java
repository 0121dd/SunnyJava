package com.kh.day15.swing.component;

import javax.swing.JDialog;
import javax.swing.JFrame;

class MyDialog extends JDialog {
	public MyDialog() {}
	public MyDialog(JFrame frame, String title) {
		
	}
}
public class Exam_JDialog extends JFrame{
	
	Exam_JDialog() {
		setTitle("메뉴 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JDialog();
	}
	
}
