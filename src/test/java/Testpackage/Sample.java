package Testpackage;

import java.util.Scanner;

public class Sample {

	public static void FindMultiple(int num) {

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num= sc.nextInt();
		FindMultiple(num);
		
	}
}
