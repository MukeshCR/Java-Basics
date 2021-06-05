package OOPSConceptPart2;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	
	public void debit();
	
	
	public void transfermoney();
}

	
	//properties of interface
	
	//no method body---only method prototype
	//we can declare the variables---variables are by default in nature
	//values of variables will not change  bcz its final/constant
	//no static methods are  in interface  bcz interface is a part of OOPS object, objects are not static
	//we cannot create the objects of interface bcz these are abstract in nature
	//no main method in interface
	
