package com.yedam.variable;

public class Promotion {
	public static void main(String[] args) {
		//자동 타입 변환
		char cVar = 'A' +1;
		int iVar = cVar;
		System.out.println(iVar);
		
		//int -> double
		double dVar = iVar;
		System.out.println(dVar);
		
		
		
	}
}
