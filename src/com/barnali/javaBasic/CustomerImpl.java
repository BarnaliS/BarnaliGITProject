package com.barnali.javaBasic;

public class CustomerImpl implements Customer,CustomerInterface{

	public static void main(String[] args) {
		CustomerImpl customerImpl = new CustomerImpl();
		customerImpl.getPayment();
		customerImpl.getReward();


	}

	@Override
	public void storePayents() {
		System.out.println("stored payment");
		
	}

	
}
