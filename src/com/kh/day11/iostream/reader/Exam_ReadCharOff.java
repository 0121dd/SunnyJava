package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			char [] cBuf = new char[3];
			int readCharCount;
			String result = "";
			while(true) {
				readCharCount = reader.read(cBuf);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
