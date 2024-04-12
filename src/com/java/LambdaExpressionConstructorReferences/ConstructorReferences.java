package com.java.LambdaExpressionConstructorReferences;
@FunctionalInterface
interface A {
	Test m1();
}
class Test {
	public static int hi() {
		System.out.println("Hello World");
		return 3;
	}
}

public class ConstructorReferences {

	public static void main(String[] args) {
		A a  = Test :: new;
		a.m1();
	}

}
