package Testpackage;

public class FindMultiples {
	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
			if (i%5==0) {
				System.out.println(i);
			}
			else {
				System.out.println("its a not a multiple of both");
			}
		}
	}

}
