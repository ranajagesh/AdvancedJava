package com.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("ABC","CAB","BCA","DAB","DCB","BHF");
		String result = name.stream().reduce("",(a,b) -> a+b.charAt(0));
		System.out.println(result);
	}
}
