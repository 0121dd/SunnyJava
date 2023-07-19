package com.kh.day17.network.socket.chath;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	
	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		String address = "127.0.0.1";
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		// 보조스트림, 기본데이터타입 입출력 도와줌
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("서버에 연결중입니다.");
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			// 보조스트림은 객체를 생성해서 주스트림을 넣는다.
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			
			while(true) {				
				// 서버에서 보낸 내용 받음
				String recvMsg = dis.readUTF();
				System.out.printf("서버(상대) : %s\n", recvMsg);
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				// 서버로 보냄
				dos.writeUTF(sendMsg);
				dos.flush(); // 버퍼 비우기
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
