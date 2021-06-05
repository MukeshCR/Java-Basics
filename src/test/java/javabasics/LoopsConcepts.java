package javabasics;

public class LoopsConcepts {
	public static void main(String[] args) {
		//1.while loop( 1 to 10)
		
		//disadvantage of this while loop this generates infinite loops if we don't keep incremental/decremental
		int i=0;					//intilization
		while (i<=10) {				//condition part
			System.out.println(i);  // print part
			i++;					// incremental/decrement part
		}
		
		System.out.println("*********************");
		
		//2.for loop (1 to 10)
		// j++  means j= j+1
		for (int j = 1; j <=10; j++) {  	//intilization, condition ,increment
			System.out.println(j);
		}
		System.out.println("*************************");
		
		// 10 to 1 reverse order 
		//k-- means k=k-1
		for (int k = 10; k >=1; k--) {		//intilization , condition, decrement
			System.out.println(k);
			
		}
		
		
		
	}

}
