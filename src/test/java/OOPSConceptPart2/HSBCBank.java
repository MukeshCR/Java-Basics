package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank { // we are achieving multiple inheritance
	// is a relationship   interface to class by using implements keyword
	
	
	
	//if a class is implementing any interface then its mandatory to define/override all the methods of Interface
	// over riding from USbank
	
	public void credit() {
		System.out.println("HSBC-----credit");
	}
	
	public void debit() {
		System.out.println("HSBC----debit");
	}
	
	public void transfermoney() {
		System.out.println("HSBC----transfermoney");
	}
	
	//seperate methods of HSBCbank
	public void Educationloan( ) {
		System.out.println("HSBC -----Edu loan");
	}
	
	public void Carloan() {
		System.out.println("HSBC-----carloan");
	}
	// Brazinbank method
	public void mutualfund() {
		System.out.println("HSBC---mutualfund");
	}

}
