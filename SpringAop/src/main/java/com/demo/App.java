package com.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demo.services.Payment;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class App {

	public static void main(String[] args) {
		
			
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(App.class);

		
	
		Payment p = con.getBean(Payment.class);
		
		
		p.makePayment();
		
		
		System.out.println(p.addTwoNumbers(8000, 3452));
		
	
	}
	
}
