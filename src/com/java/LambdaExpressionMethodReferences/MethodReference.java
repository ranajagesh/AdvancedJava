package com.java.LambdaExpressionMethodReferences;

@FunctionalInterface
interface A {
	void m1();
}

class Test {
	public int hi() {
		System.out.println("Hello Bangalore 3010");
		System.out.println("m1 method implementation");
		return 0;
	}
}

public class MethodReference {
	public static void main(String[] args) {
		Test t = new Test();
		A a = t :: hi;
		a.m1();
	}

}
