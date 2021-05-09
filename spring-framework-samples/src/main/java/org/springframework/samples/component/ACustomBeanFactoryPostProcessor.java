package org.springframework.samples.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author wangyong
 */
@Component
public class ACustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanInitLifeCycle1 = beanFactory.getBeanDefinition("beanInitLifeCycle");
		System.out.println(beanInitLifeCycle1);
	}
}
