package com.barnali.java8Interface;

public interface Vehicle {
	   String variable1="black";// all fields are automatically public, static, and final
	default void print(){//interface does not allow private n protected access modfiers it throws compile erros
		System.out.println("I ama a vehicle");
	}
	
	static void blowHorn(){
		System.out.println("Blowing horn");
	}

}
