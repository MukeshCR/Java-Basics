package javabasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept { // dynamic array

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add(125);
		ar.add(456);
		ar.add(971);

		System.out.println(ar.size());

		ar.add(400);
		ar.add(987);

		System.out.println(ar.size());

		ar.add("Hello");
		ar.add(5.6);
		ar.add('M');

		System.out.println(ar.size());
		System.out.println(ar.get(5));
		// System.out.println(ar.get(9)); // arrayindexoutofboundException bcz 9 index
		// doesnt exits

		// to print all the values of Arraylist

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer> arr = new ArrayList<Integer>(); // restricting access only to particular datatype
		arr.add(100);
		arr.add(420);
	}

	// If in case we did not mention any restriction we can all type of data

}
