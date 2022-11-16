package org.banknew;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("Bank saving 5%");
	}
	
public static void main(String[] args) {
	
	AxisBank a = new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
	
	
	
}
	
	
	
}
