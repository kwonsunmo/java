package com.yedam.variable;

public class LiteralExample {
	public static void main(String[] args) {
		
		// int 사용
		int var1 = 0b1011; //2진수(0b로 시작)
		int var2 = 0206; //8진수(0의로 시작)
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수(0x로 시작)	
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//byte -128 ~127
		byte bVal1 = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		//byte bVal4 = 500; //데이터 타입 변경 or 값 변경
		
		//long
		long lVal1 = 10;
		long lVal2 = 1000000000000000000L; //int가 가지는 범위를 넘어서 long에 넣게 되면, long 타입이라고 표현. 
		
		//char(유니코드)
		//문자 다룰 때 쓰는 기본타입.
		char cVar1 = 'A' ;//65
		char cVar2 = '가';
		char cVar3 = 67;
		char cVar4 = 0x0041;
		
		System.out.println(cVar1);
		System.out.println(cVar2);
		System.out.println(cVar3);
		System.out.println(cVar4);
		
		
		
		//문자열
		//char cVal5 = '홍';
		String str = "홍길동";
		String str2 = "프로그래머";
		System.out.println(str);
		System.out.println(str2);
		
		//이스케이프 문자
		//탭만큼 띄움(\t)
		System.out.println("번호 \t이름 \t직업");
		//엔터(\n)
		System.out.println("행 단위 출력\n");
		//특수문자 존재 여부 확인(\", \', \\)
		System.out.println("우리는 \"개발자\"입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		
		
		
	}
}
