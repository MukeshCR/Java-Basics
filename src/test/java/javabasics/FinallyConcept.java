package javabasics;

public class FinallyConcept {
	// finally is block

	public static void main(String[] args) {
		//test1();
		//test2();
		//division();
		Division2();
		
		
	}
	
	public static void test1() {
		try {
			System.out.println("inside test method");
			throw new RuntimeException("test");
			
		} catch (Exception e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}
	
	
	public static void test2() {
		try {
			System.out.println("i am inside test2");
		} 
		finally {
			System.out.println("finally code in the test2 method");
		}
		}
	
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
			
		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by xero error");
		}
		
		finally {
			System.out.println("executed this code even after any exception");
		}
		
	}
	
	public static void Division2() {
		int i=2;
		try {
			System.out.println("insinde try block");
			int j=i/0;
		} catch(NullPointerException e) {
			System.out.println("inside the catcch block");
			System.out.println("division error ");
		}
		finally {
			System.out.println("execute even after the exception");
		}
	}
	}
