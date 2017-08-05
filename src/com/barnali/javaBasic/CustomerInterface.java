package com.barnali.javaBasic;

public interface CustomerInterface {
	public default void getReward(){
		System.out.println("another cusomer interface");
	}

}
