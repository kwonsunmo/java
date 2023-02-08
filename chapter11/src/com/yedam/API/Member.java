package com.yedam.API;

public class Member {
	
	
	//equals 재정의(오버라이딩)
	///equals => 논리적으로 동등한 객체임을 확인
	//확인 방법 : 객체가 가진 데이터가 동일 -> 논리적으로 동등
	
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}

	
	//메소드
	//논리적으로 동등하다
	@Override
	public boolean equals(Object obj) {
		//Object obj -> 모든 클래스를 자동타입변환 할 수 있는 객체
		//모든 객체는 obj에 담을 수 있다.
		if(obj instanceof Member) {
			//obj가 member 탑인지 확인.
			//Member 타입으로 강제 타입변환
			Member member = (Member)obj;
			//equals를 사용한 객체의 id와 매개변수의 객체 id를 비교
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}


	@Override
	public int hashCode() {
		//String 문자열의 데이터 같으면 주소 값이 같다.
		//String str = "A"  => 300번지 -> 3
		//String str2 = "A" => 300번지 -> 3
		return id.hashCode();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
