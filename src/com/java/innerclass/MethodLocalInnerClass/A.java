package com.java.innerclass.MethodLocalInnerClass;

public class A {
	public void m1() {
		class B {
			int a =10;
			public void m1() {
				System.out.println("Hello world");
			}
		}
		B b = new B();
		b.m1();
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
