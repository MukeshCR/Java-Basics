package OOPSConceptPart2;

public class Testbank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank bank = new HSBCBank();   //staicpolymorphism or Compiletime ploymorphism
		bank.credit();
		bank.debit();
		bank.transfermoney();
		bank.Educationloan();
		bank.Carloan();
		
		System.out.println("---------------------------");
		
	//dynamic polymorphism
	//child class object can be refered by parent class refernce variabel
		
	USBank b	=new HSBCBank();
	b.credit();
	b.debit();
	b.transfermoney();
		
		
		
	}
}
