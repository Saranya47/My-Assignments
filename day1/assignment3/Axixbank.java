package week3.assignment3;

public class Axixbank extends BankInfo {

	
	public void deposit() {
	

		System.out.println("Deposit Amount - 100000");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Account Details");
		Axixbank AB=new Axixbank();
				
			AB.saving();
		    AB.fixed();
		    AB.deposit();
		
		
	}

}
