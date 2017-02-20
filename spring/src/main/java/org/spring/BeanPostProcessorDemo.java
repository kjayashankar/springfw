package org.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessorDemo1 after initialization for :"+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanPostProcessorDemo1 before initialization for :"+arg1);

		return arg0;
	}

}
