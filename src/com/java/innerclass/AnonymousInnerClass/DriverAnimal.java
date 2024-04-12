package com.java.innerclass.AnonymousInnerClass;

public class DriverAnimal {

	public static void main(String[] args) {
		Animal a = new Animal() {
			public void talk() {
				System.out.println("Human Are Talking");
			}
		};
		a.talk();
	}

}
