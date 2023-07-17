package com.kh.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangeBackground extends JFrame {
	
	public Exercise_ChangeBackground() {
		setTitle("Key Code 예제, F1키 : 초록색, %키 : 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JLabel la = new JLabel();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		c.setLayout(null);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				la.setText(e.getKeyText(e.getKeyCode()));
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				
				if(keyChar == '%') {					
					c.setBackground(Color.GREEN);
				}else if(keyCode == KeyEvent.VK_F1) {					
					c.setBackground(Color.YELLOW);
				}else {
					c.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		la.setSize(100,20);
		la.setLocation(0, 50);
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		// 키 입력받기 위해 포커스 줌
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Exercise_ChangeBackground();
	}
}
