package com.kh.day17.exercise.mine;

public class Motel {
	int [] rooms = new int[10];
	int roomNum;
	
	public Motel() {
		rooms = new int[10];
		roomNum = 0;
	}

	public Motel(int[] rooms, int roomNum) {
		this.rooms = rooms;
		this.roomNum = roomNum;
	}

	public int[] getRooms() {
		return rooms;
	}

	public void setRooms(int[] rooms) {
		this.rooms = rooms;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
}
