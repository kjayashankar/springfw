package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args){
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext ("SpringConfig.xml");
		
		((AbstractApplicationContext) context).registerShutdownHook();
		Car car = (Car) context.getBean("carBean");
		car.honk();
		
		car.checkThrust();
		car.showWheels();
		car.showDriver();
		Car car2 = (Car) context.getBean("carBean");
		car2.showDriver();
	}
	
}
