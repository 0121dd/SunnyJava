package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame{
	private JLabel imgLabel;
	public Exam_JMenuActionEvent() {
		setTitle("메뉴에 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		imgLabel = new JLabel();
		c.setLayout(new BorderLayout());
		setSize(250, 220);
		setVisible(true);
	}
	
	private void createMenu()	 {
		JMenuBar bar = new JMenuBar();
		JMenu screenMenu = new JMenu("screen");
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		for(int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]);
			menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					switch(cmd) {
						case "Load" : 
							if(imgLabel.getIcon() != null) return;
							imgLabel.setIcon(new ImageIcon("images/img.jpg"));
							break;
						case "Hide" : 
							imgLabel.setVisible(false);
							break;
						case "ReShow" : 
							imgLabel.setVisible(true);
							break;
						case "Exit" : System.exit(0);
							break;
					}
				}
			});
			screenMenu.add(menuItem);
		}
//		screenMenu.add(new JMenuItem("Load"));
//		screenMenu.add(new JMenuItem("Hide"));
//		screenMenu.add(new JMenuItem("ReShow"));
//		screenMenu.add(new JMenuItem("Exit"));
		bar.add(screenMenu);
		setJMenuBar(bar);
	}
	
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();
	}
	
}
