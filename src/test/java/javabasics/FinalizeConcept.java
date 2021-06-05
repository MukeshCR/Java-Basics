package javabasics;

public class FinalizeConcept {
	
	//finalize is a method
	// just before the Garbage collector automatically called by JVM Finalize method called to clean up actions just 
	// before the garbage collector
	
	
	public void finalize() {
		System.out.println("inside finlaize method");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		System.gc();
		
				
	}

}
