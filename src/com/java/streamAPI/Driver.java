package com.java.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		
//		list.forEach(i -> System.out.println(i));
		
		Stream<Integer> st = list.stream();
//		st.forEach(i -> System.out.println(i));
		
		Stream<Integer> newStream = st.map(i -> i*5);
//		newStream.forEach(i -> System.out.println(i));
		
		Stream <Integer> sti = list.stream().filter(i -> (i%3==0));
//		sti.forEach(i -> System.out.println(i));
		
		List<Integer> newList = list.stream().map(i -> i*3).collect(Collectors.toList());
//		System.out.println(newList);
		
		int[]a = {10,20,30,40,50};
		IntStream sta= IntStream.of(a);
		sta.forEach(i-> System.out.println(i));
		
		int num = 6;
		String ans = IntStream.range(1, num-1).filter(i -> (num%i==0)).sum()== num ? "Perfect":"Not Perfect";
		System.out.println(ans);
		
		
		
		
		
	}

}
