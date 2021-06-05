package javabasics;

public class Flipkart extends Amazon {

	void sell() {
		System.out.println("Selling Electronics+ books");
	}

	public static void main(String args[]) {
		Amazon A = new Amazon();
		A.Electronics(); // overriding methods of amazon by creating object in Flipkart class
		A.Clothing();

	}
}
