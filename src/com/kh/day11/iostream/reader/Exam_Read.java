package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader; 

public class Exam_Read {

	public static void main(String[] args) {
		// Cannot instantiate the type Reader // 추상클래스
		Reader reader = null;
		
		try {
			// 이런 것들을 Checked Exception이라고 함.
			// Unhandled exception type FileNotFoundException // try ~ catch 안쓰면 사용 못해.
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			
			while(true) {
				// Unhandled exception type IOException
				// 데이터들이 다 숫자라서 int 사용
				int readData = reader.read(); 
				if(readData == -1) break;
				System.out.print((char)readData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// Unhandled exception type IOException
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
