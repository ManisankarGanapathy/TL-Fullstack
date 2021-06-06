package com.corejava.training.qn01;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Arithmatic calculator");
		System.out.println(args.length);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition: " + (a + b));
		System.out.println("Subraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
	}

}
