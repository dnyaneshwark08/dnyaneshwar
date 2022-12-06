package com.demo.services;


import org.springframework.stereotype.Component;

@Component
public class Payment{
	
	
	

	public void makePayment() {
	
		
		System.out.println("Amount Debited......");
		System.out.println("Amount Credited.....");
		
	}
	
	

    public int addTwoNumbers(int l,int s) {
		int result = s + l ;
		return result;
		
	
      }
}

