package com.java.innerclassNonStatic;

import com.java.innerclassNonStatic.Majnu.Laila;

public class Driver {

	public static void main(String[] args) {
		Majnu m = new Majnu();
		Laila l = m.new Laila();
		l.m1();
	}

}
