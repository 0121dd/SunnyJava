package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame{

	public Exam_DblclickChangeColor() {
		setTitle("Click and Dbl Click Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
//		c.setBackground(Color.BLACK);
		c.addMouseListener(new MyMouseListener());
		
		
		setSize(300,200);
		setVisible(true);
	}
// MouseListener를 쓰면 사용하지 않을 메소드도 다 오버라이딩해야 한다.
//	private class MyMouseListener implements MouseListener {
	private class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블클릭 구현
			if(e.getClickCount() == 2) {
				// (int) Math.random() * (최댓값 - 최소값 + 1) + 최소값
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
//				c.setBackground(Color.BLACK);
				c.setBackground(new Color(red,green,blue));
			}
		}

	}
	
	public static void main(String[] args) {
		new Exam_DblclickChangeColor();
	}

}
