package org.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Driver {

	private String name;

	@PostConstruct
	public void init() {
		System.out.println("init driver");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy driver");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
