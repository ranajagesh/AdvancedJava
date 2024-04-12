package com.java.LambdaExpression;

public class Driver {
	public static void main(String[] args) {
		A a = (i) -> {
			System.out.println("Hi");
			return 3;
			};
			System.out.println(a.m1(20));
	}
}
