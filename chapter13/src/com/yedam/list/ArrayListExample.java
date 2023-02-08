package com.yedam.list;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
	public static void main(String[] args) {
		//List<E>
		//데이터를 String 문자열을 넣을 수 있는 ArrayList
		List<String> list = new ArrayList<String>();
		
		//list 데이터 추가
		list.add("Java");//인덱스 0
		list.add("JDBC");//인덱스 1
		list.add("Servelt/JSP");//인덱스 3
		//인덱스 2 데이터 추가 -> 인덱스 2 DataBase, 인덱스 3 Servelt/JSP
		list.add(2,"DataVase");//인덱스 2
		list.add("iBatis");// 인덱스 4
		
		//list.size() -> list의 크기
		for(int i = 0; i <list.size(); i++) {
			//list.get(index) -> 해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("====================================");

		//list.remove(index) -> 해당 인덱스의 객체 삭제
		list.remove(2); //index 2의 객체 삭제
		for(int i = 0; i <list.size(); i++) {
			//list.get(index) -> 해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println("====================================");
		//객체를 꼭 집어서 삭제
		list.remove("JDBC");
		list.remove(2); //index 2의 객체 삭제
		for(int i = 0; i <list.size(); i++) {
			//list.get(index) -> 해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("====================================");

		//리스트 객체 전부 삭제
//		list.clear();
//		System.out.println(list.size());
		
		System.out.println(list.contains(""));
		//isEmpty()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
