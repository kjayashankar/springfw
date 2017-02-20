package org.spring;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean{
	
	private Driver driver;
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	private List wheels;
	
	public List getWheels() {
		return wheels;
	}

	public void setWheels(List wheels) {
		this.wheels = wheels;
	}

	Engine engine;
		
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void honk(){
		System.out.println("Beep Beep! ");
	}
	
	public void checkThrust(){
		engine.thrust();
	}
	@PostConstruct
	public void init(){
		System.out.println("init car");
	}
	public void showWheels(){
		System.out.println("car got "+wheels.size()+" wheels");
	}
	
	public void showDriver(){
		System.out.println(driver.getName());
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("car : after prop set");
	}

	public void destroy() throws Exception {
		System.out.println("disposable : destroy car");
	}
}
