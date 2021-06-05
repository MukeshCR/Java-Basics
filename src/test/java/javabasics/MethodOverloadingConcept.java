package javabasics;

public class MethodOverloadingConcept {
	
	// Example for method Overloading 

	void send(int i) {
		System.out.println("sending integer type of data");
	}

	void send(String message, int i) {
		System.out.println("sending text and numbers ");
	}

	void send(int i, String msg) {
		System.out.println("sending integer data and string type of data");
	}

	public static void main(String[] args) {
		MethodOverloadingConcept M1 = new MethodOverloadingConcept();
		M1.send(19380);
		M1.send(123, "Helloworld");
		M1.send("Its methodoverloadingConcept", 55);

	}

}
