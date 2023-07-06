package com.kh.day08.oop.interfacepkg.music;

public class Guitar implements Instrument{
	@Override
	public void tunning() {
		System.out.println("zziinnggg doonggggg");
	}
	
	@Override
	public void playInstrument() {
		System.out.println("doonggggg zziinnggg");
	}
}
