package com.kh.day11.iostream.inpustream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		
		// Unhandled exception type FileNotFoundException => Checked Exception
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByte;
//			while(true) {
//				readByte = is.read();
//				if(readByte == -1) break;
//				System.out.print((char)readByte);
//			}
			do { // 먼저 읽고 나중에 조건
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
