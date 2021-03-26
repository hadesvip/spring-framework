package org.springframework.samples.component

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory

/**
 * 开发
 * @author wangyong
 */
class CustomBeanFactoryPostProcessor : BeanFactoryPostProcessor {
	override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
		val beanInitLife = beanFactory.getBeanDefinition("beanInitLifeCycle1")
		print(beanInitLife)
	}
}