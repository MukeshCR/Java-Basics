package OOPSConceptPart2;

public class CitiBank implements Bank{
	
	public void DisplayIntresetRate() {
		System.out.println("4.5%");
	}

	public static void main(String[] args) {
		CitiBank bank = new CitiBank();
		bank.DisplayIntresetRate();

	}

}
