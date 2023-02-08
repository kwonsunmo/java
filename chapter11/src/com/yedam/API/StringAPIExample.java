package com.yedam.API;

public class StringAPIExample {
	public static void main(String[] args) {
		//1) 문자열 뒤집기
		//String str = "abcdefg" -> gfedcba"
		
		String str = "abcdefg";
		for(int i =str.length()-1 ; i >= 0 ; i--) {
			System.out.println(str.charAt(i));
		}
		
	}
}
