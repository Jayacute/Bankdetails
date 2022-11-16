package org.bank;

public class BankInfo1 extends BankInfo {

	@Override
	public void saving() {
	System.out.println("saving interest 15%");
		
	}

	public static void main(String[] args) {
		
		BankInfo a=new BankInfo();
		
		a.fixed();
		a.deposit();
		a.saving();
	
		
		
	}
	
}



