package com.java.innerclassStaticInner;

public class A {
	static class B {
		public static void m1() {
			System.out.println("m1 static method");
		}
		public void m2() {
			System.out.println("m2 non static method");
		}
	}
}
