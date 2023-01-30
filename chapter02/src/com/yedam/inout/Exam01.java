package com.yedam.inout;

public class Exam01 {
	public static void main(String[] args) {
		int value =123;
		String name = "상품";
		double price =1000.10;
		
		System.out.printf("상품의 가격 : %d\n",value);
		System.out.printf("%s의 가격 : %d\n", name, value);
		System.out.printf("%s의 가격 : %d원, %f\n",name,value,price);
		
		//frintf 옵션 추가
		value =11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		
		
		//실수
		price =321.1234;
		System.out.printf("%f\n", price);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
		
		
		//기본출력문
		System.out.printf("아무것도 없는 print\n");
		//문자열
		System.out.printf("%s\n", "문자열사용");
		System.out.printf("%10s\n", "문자열사용");
		System.out.printf("%-10s\n", "문자열사용");
		
		
		
	}
}
