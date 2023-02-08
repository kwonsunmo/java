package com.yedam.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapExample {
	public static void main(String[] args) {
		//key : Sting, value : Integer
		Map<String, Integer> map = new HashMap<>();
		
		map.put("고길동", 85);
		map.put("김또치", 90);
		map.put("고희동", 80);
		map.put("김또치", 33);
		//entry 수
		System.out.println("총 Entry 수 : " + map.size());
		
		//key ㄱ밧을 활용한 객체 찾기
		System.out.println("\t김또치 : " + map.get("김또치"));
		System.out.println();
		
		//반복자(iterator)
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + " value : "+ value);
		}
		
		//Entry 삭제
		map.remove("고길동");
		System.out.println("총 Entry : " + map.size());
		
		//Entry <K,V> 다 호출 Entry 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value =entry.getValue();
			System.out.println("key : " + key + " value : "+ value);
		}
		System.out.println();
		
		for(Map.Entry<String, Integer> mEntry : entrySet ) {
			String key =mEntry.getKey();
			Integer value = mEntry.getValue();
			
			System.out.println("key : "+ key + " value : " + value);
		}
		
		
		map.clear();
		System.out.println("총 Entry : " + map.size());
		
		
		
		
		
		
		
		
	}
}
