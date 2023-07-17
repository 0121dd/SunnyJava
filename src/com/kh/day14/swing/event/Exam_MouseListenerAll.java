package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame{

	public JLabel la;
	
	public Exam_MouseListenerAll() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("no Mouse Event");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300, 200);
		setVisible(true);
	}
	
// 내부클래스
// 인터페이스 다중상속 (extends는 다중상속 불가능)
	private class MyMouseListener implements MouseListener, MouseMotionListener {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.LIGHT_GRAY);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.RED);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged(" + e.getX() + ", " + e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")");
		}
	}
	public static void main(String[] args) {
		new Exam_MouseListenerAll();
	}
	
}
