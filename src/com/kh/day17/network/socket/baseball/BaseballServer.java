package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 7777;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Date now = new Date();
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] ranNums = new int[3];
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			System.out.println(sdf.format(now));
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			// 중복없이 랜덤 수 뽑기
			System.out.print("서버 숫자 -> ");
			for(int i = 0; i < ranNums.length; i++) {
				ranNums[i] = (int)(Math.random()*9+1);
				for(int k = 0; k < i; k++) {
					if(ranNums[k] == ranNums[i]) {
						// 다시 뽑기
						i--;
						break;
					}
				}
			}
			System.out.printf("%d %d %d\n", ranNums[0], ranNums[1], ranNums[2]);
			System.out.println("서버 준비 완료");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
				
				// 게임 플레이
				String[] recvArrs = recvMsg.split(" ");
				int strike = 0;
				int ball = 0;
				for (int i = 0; i < ranNums.length; i++) {
					for (int j = 0; j < recvArrs.length; j++) {
						if ((Integer.parseInt(recvArrs[j])) == ranNums[i]) {
							if(j == i) {
								strike++;
							}else {
								ball++;
							}
						}
					}
				}
				// 게임 결과
				String result = strike + "스트라이크 " + ball + "볼";
				System.out.println(result);
				dos.writeUTF(result);
				dos.flush();
				/*
				if(strike == 3) {
					dos.writeUTF(Integer.toString(strike));
					dos.flush();
					System.out.println("아웃! 게임종료");
					break;
				}else {					
					System.out.println(result);
					dos.writeUTF(result);
					dos.flush();
				} */
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
