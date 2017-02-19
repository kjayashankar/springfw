package org.spring;

public class Car {
	
	Engine engine;
		
	Car(Engine engine){
		this.engine = engine;
	}

	public void honk(){
		System.out.println("Beep Beep! ");
	}
	
	public void checkThrust(){
		engine.thrust();
	}
	
	
}
