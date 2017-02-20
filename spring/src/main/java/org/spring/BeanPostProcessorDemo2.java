package org.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessorDemo2 implements Ordered, BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessorDemo2 after initialization for :"+arg1);

		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessorDemo2 before initialization for :"+arg1);

		return arg0;
	}

	public int getOrder() {
		// 0 has highest priority
		return 0;
	}

}
