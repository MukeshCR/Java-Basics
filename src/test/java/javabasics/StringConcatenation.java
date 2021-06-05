package javabasics;

public class StringConcatenation {
	public static void main(String[] args) {
		// + is a concatenation operator
		int i =100;
		int j=200;
		
		double d=1.233;
		double e=14.4456;
		
		
		String s1= "Hello";
		String s2="world";
		
		System.out.println(i+j);
		System.out.println(s1+s2);
		System.out.println(i+j+s1+s2);
		System.out.println(s1+s2+i+j);
		System.out.println(s1+s2+(i+j));
		System.out.println(i+j+s1+s2+i+s1+j+s2);
		System.out.println(i+j+s1+s2+i+j);
		
		System.out.println(d+e);
		System.out.println("the value of d and e is "+(d+e));
		System.out.println("the value of s1 and s2 and d and e and i and j is "+(s1+s2)+(d+e)+(i+j));
		
		System.out.println("hello world");  //println is used to print on the console with new line
		System.out.print("hello selenium"); //print is used to print on the console
		System.out.print( "it is not new line");
	}

}
