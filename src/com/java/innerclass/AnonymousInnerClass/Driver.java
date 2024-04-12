package com.java.innerclass.AnonymousInnerClass;

public class Driver {
	public static void main(String[] args) {
		Car c = new Car() {
			public void start() {
				System.out.println("Car has been started,peek-peek");
			}
		};
		Car c1 = new Car() { //  new  --> is used to create anonymous class object that are called as child class of Car class.			
			public void start() {
				System.out.println("Car Started");
			}
		};
		
		c.start();
		c1.start();
	}
}
