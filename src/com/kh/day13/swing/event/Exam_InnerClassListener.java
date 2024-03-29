package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_InnerClassListener extends JFrame {

	public Exam_InnerClassListener() {
		
		setTitle ("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	// 내부 클래스
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
			Exam_InnerClassListener.this.setTitle(btn.getText() + " 이벤트 리스너 예제");
		}
	}
	
	public static void main(String[] args) {
		new Exam_InnerClassListener();
	}
}


