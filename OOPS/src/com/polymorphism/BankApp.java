package com.polymorphism;

public class BankApp {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.compactCode(new Bank());
		
		a.compactCode(new UPI());
		
		a.compactCode(new Card());
	}
	
}

