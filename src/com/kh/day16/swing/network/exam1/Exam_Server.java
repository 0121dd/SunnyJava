package com.kh.day16.swing.network.exam1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_Server {

	public static void main(String[] args) {
		System.out.println("Server");
		Socket socket = null;
		
		try {
			System.out.println("서버 소켓 생성 완료");
			System.out.println("클라이언트 연결 대기중...");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결 수락됨");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
