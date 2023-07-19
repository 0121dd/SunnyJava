package com.kh.day17.network.socket.chath;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		ServerSocket serverSocket = null;
		int port = 7777;		
		InputStream is = null;
		OutputStream os = null;
		// 보조스트림, 기본데이터타입 입출력 도와줌
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("채팅서버를 구동 중입니다...");
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			// 보조스트림은 객체를 생성해서 주스트림을 넣는다.
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			
			while(true) {				
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				// 클라이언트로 보냄
				dos.writeUTF(sendMsg);
				dos.flush(); // 버퍼 비우기
				// 클라이언트에서 보낸 내용 받음
				String recvMsg = dis.readUTF();
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
