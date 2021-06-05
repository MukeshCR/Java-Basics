package javabasics;

public class Arrayconcept {

	public static void main(String[] args) {
		
		//array to store similar data types in array variable
		//lowest index =0  
		//highest index=n-1
		//static array because size is fixed ....to over come this we use collections
		//stores only similar data types .....to over come this we use object Array

		// 1.int array
		int i[] =new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;

		System.out.println(i[2]);
		System.out.println(i[3]);

		//System.out.println(i[4]);  //ArrayIndexOutOfBoundsException

		System.out.println(i.length); //length of array

		// to print all the values of array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);

		}

		//2.double array
		double d[] = new double[3];
		d[0]=12.5;
		d[1]=22.50;
		d[2]=10.5;

		for (int k = 0; k < d.length; k++) {
			System.out.println(d[k]);

		}

		//3.char array
		char c[] = new char[2];
		c[0]='A';
		c[1]='D';


	//4.boolean array
	boolean b[] = new boolean[2];
	b[0]=true;
	b[1]=false;
	System.out.println(b.length);


	//5.String array
	String s[] = new String[2];
	s[0]= "Hello";
	s[1]="World";


	System.out.println(s.length);
	System.out.println(s[1]);
	
	//object array also called as dynamic array
	Object ob[] = new Object[6];
	ob[0]= "Tom";
	ob[1]="25";
	ob[2]="01/01/2000";
	ob[3]="22.5";
	ob[4]="o+ve";
	ob[5]="London";
	
	System.out.println(ob.length);
	for (int z = 0; z < ob.length; z++) {
		System.out.println(ob[z]);
		
	}

	}
}

