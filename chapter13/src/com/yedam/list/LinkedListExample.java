package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		//ArrayList 
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : "+(endTime - startTime));
		
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : "+(endTime-startTime));
	}
}
