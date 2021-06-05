package javabasics;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable(); // in this we have to provide two values inthe form of key,value
		h.put('A', "Test");
		h.put('B', "Hello");
		h.put('C', "World");

		System.out.println(h.size());

		h.put(1, 500);
		h.put(2, 600);

		System.out.println(h.size());
		System.out.println(h.get(2));

	}
}
