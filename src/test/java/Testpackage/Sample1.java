package Testpackage;

import java.util.Scanner;

public class Sample1 {
	public static void Findmultiple(int num) {
		for (int i = 10; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			} else if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Findmultiple(num);
	}

}
