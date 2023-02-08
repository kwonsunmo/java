package com.yedam.API;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class 클래스
		//Class에서 정보 얻기
		Class clazz = Member.class;
		System.out.println("Class 정보 : " + clazz);
		
		//클래스 결로 입력해서 정보 얻기
		clazz = Class.forName("com.yedam.API.Member");
		System.out.println(clazz);
		
		//객체를 통한 정보 얻기
		Member member = new Member("또치");
		clazz = member.getClass();
		System.out.println(clazz);
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		
		//절대 경로
		String photoPath = clazz.getResource("lion.jpg").getPath();
		System.out.println(photoPath);
		
	}
}
