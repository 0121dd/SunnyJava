package com.kh.day17.exercise.teacher.oop.motel.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day17.exercise.teacher.oop.motel.controller.MotelController;
import com.kh.day17.exercise.teacher.oop.motel.view.MotelView;

public class MotelRun {

	public static void main(String[] args) throws Exception {
		MotelView view = new MotelView();
		MotelController controller = new MotelController();
		Scanner sc = new Scanner(System.in);
		int chosenRoom = 0;
		Boolean roomState = null;
		end : 
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1 : 
				chosenRoom = view.inputRoomNubmer("입실");
				roomState = controller.checkRoomState(chosenRoom);
				controller.checkIn(roomState, chosenRoom);
				view.roomCheckin(roomState, chosenRoom);
				Thread.sleep(500);
				break;
			case 2 : 
				chosenRoom = view.inputRoomNubmer("퇴실");
				roomState = controller.checkRoomState(chosenRoom);
				controller.checkOut(roomState, chosenRoom);
				view.roomCheckOut(roomState, chosenRoom);
				Thread.sleep(500);
				break;
			case 3 : 
				List<Boolean> rList = controller.getAllRooms();
				view.printAllRooms(rList);
				Thread.sleep(1300);
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

}
