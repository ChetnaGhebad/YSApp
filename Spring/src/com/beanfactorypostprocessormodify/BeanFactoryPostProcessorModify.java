//custom BeanFactoryPostProcessor

package com.beanfactorypostprocessormodify;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorModify implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)//beanFactory is instance
			throws BeansException {
		BeanDefinition beanDefination = beanFactory.getBeanDefinition("restBean");
		MutablePropertyValues propertyValue = beanDefination.getPropertyValues();
		propertyValue.addPropertyValue("welcomenote", "This is Modified Message");
	}

}
