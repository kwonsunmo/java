package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		//강제 타입 변환
		int intValue = 65;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		char cVar = (char)intValue;
		System.out.println(cVar);
		
		//실수 -> 정수 강제 타입 변환
		double dVar = 3.14444;
		intValue = (int) dVar;
		System.out.println(intValue);
		
		//자동 타입변환
		dVar =intValue;
		System.out.println(dVar);
		
	}
	
	
}
