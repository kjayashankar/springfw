package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args){
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Car car = (Car) context.getBean("carBean");
		
		car.honk();
	}
	
}
