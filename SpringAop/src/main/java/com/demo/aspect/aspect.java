package com.demo.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.demo.App;
import com.demo.services.Payment;

@Aspect
@Component
public class aspect {

	
	
	static Logger logger = Logger.getLogger(App.class);
	
	public aspect() {
		
		logger.info("logger aspect");
		
	
	}
	
	
	
	@Before("execution(* com.demo.services.Payment.makePayment())")
	public void printMsgBeforePayment() {
		
		System.out.println("before payment started...........");
		logger.info("before payment...");
	}
	
	

	
	@After("execution(* com.demo.services.Payment.makePayment())")
	public void printMsgAfterPayment() {
		System.out.println("payment done.");
		logger.info(" Done");
		
		
	}
	
	
	
	@Pointcut("execution(* com.demo.services.Payment.addTwoNumbers())")
	public void the() {
		
		logger.info("the-method");
		
	}
	

	
	@AfterReturning(pointcut = "the()",returning = "result")
	public void additionNumber(int result) 
	{
		System.out.println("result = " + result);
		logger.info(result);
	}



	
	
}
