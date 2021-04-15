package org.springframework.samples.component

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component

/**
 *
 * @author wangyong
 */
@Component
class CustomBeanPostProcessor : BeanPostProcessor {

	override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
		println("CustomBeanPostProcessor#postProcessBeforeInitialization")
		return super.postProcessBeforeInitialization(bean, beanName)
	}

	override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
		println("CustomBeanPostProcessor#postProcessAfterInitialization")
		return super.postProcessAfterInitialization(bean, beanName)
	}
}