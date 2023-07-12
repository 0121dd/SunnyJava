package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
	public Exam_ContentPane() {
		// 스윙 프레임만들기
		setTitle("ContentPane과 JFrame");
		setSize(300, 150);
		setVisible(true);
		// 실제로 종료하도록 함(그 전엔 안보이게만 함)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK);
		// 버튼 안겹치게 만들어줌
		contentPane.setLayout(new FlowLayout()); 
		
		// 버튼
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("cancel"));
		contentPane.add(new JButton("Ignore"));
		
		
	}
	
	public static void main(String[] args) {
		new Exam_ContentPane();
	}
}
