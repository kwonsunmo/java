package com.yedam.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample02 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "김또치"), 95);
		map.put(new Student(1, "김또치"),	90);
		
		System.out.println("총 Entry : " + map.size());
	}
}
