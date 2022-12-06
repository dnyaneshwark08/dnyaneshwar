package com.demo.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springCore.Setters.Bike;
import com.demo.springCore.annotation.Rider;
import com.demo.springCore.constructor.Car;

@Configuration
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
       
    	// By xml ..
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	Car s1 = context.getBean(Car.class);
    	System.out.println(s1);
    	
    	Bike b = context.getBean(Bike.class);
    	System.out.println(b);
    	
    	
    	// By using Annotations
       	
    	AnnotationConfigApplicationContext cn = new AnnotationConfigApplicationContext(App.class);
    	
    	Rider r = cn.getBean(Rider.class);
    	
    	System.out.println("ridername :"+r.getRidername());
    	System.out.println("riderAge :"+r.getRiderAge());
    	System.out.println("licenseNumber :"  + r.getLicenseNo());
    	
    	
    	
         
    }
}
