package com.barnali.javaBasic;

public  interface Customer {
	//java 8- methods with default and static keyword can be used now
	
	public static void getRewardPoints(){
		
	}

  public default void getPayment(){
	  System.out.println("Got payment from the customer");
		
	}
  void storePayents();
}
