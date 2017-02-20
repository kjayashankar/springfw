package org.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		BeanDefinition def = beanFactory.getBeanDefinition("driverBean");
		
		MutablePropertyValues props = def.getPropertyValues();
		
		//props.addPropertyValue("name", "beanified Jay");
	}

}
