package javabasics;

public class MethodOverloading {
	
	//example for MethodOverloading

	public static void Add() {
		System.out.println("add method with no parameter");
	}

	public static void Add(int i) {
		System.out.println("Add method with one parameter "+ i);
	}

	public static void Add(int i, double d) {
		System.out.println("Add method with one parameter "+ i);
		System.out.println("Add method with one parameter "+ d);
	}

	public static void main(String[] args) {
		Add();
		Add(10);
		Add(35, 45.5);

	}

}
