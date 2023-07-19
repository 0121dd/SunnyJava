package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
//			System.out.println(".");
//			Thread.sleep(1000); // 1초동안 일시정지시킴
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
			
			System.out.println("서버 구동중입니다..");
			for(int i = 0; i <= 40; i++) {
				System.out.print("=");
				Thread.sleep(10);
			}
			System.out.println("100%");
			
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			// 보낼 준비
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {				
				// 데이터 받기
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료되었습니다.");
					break ;
				}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue; // 반복문 다시 동작
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = null;
				switch(operator) {
					case "+" : 
						result = String.valueOf(num1 + num2); 
						break;
					case "-" : 
						result = String.valueOf(num1 - num2); 
						break;
					case "/" : // 문자열 추가해서 문자열로 만들어도 됨.
						result = num1 / num2 + ""; 
						break;
					case "*" : 
						result = Integer.toString(num1 * num2); 
						break;
					case "%" : 
						result = Integer.toString(num1 % num2); 
						break;
				}
				dos.writeUTF(result);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
