package org.springframework.samples.component

import org.springframework.beans.BeansException
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.BeanFactoryAware
import org.springframework.context.LifecycleProcessor

/**
 * 自定义生命周期处理器
 * @author wangyong
 */
class CustomLifecycleProcessor : LifecycleProcessor, BeanFactoryAware {

	private var beanFactory: BeanFactory? = null

	override fun start() {
		TODO("Not yet implemented")
	}

	override fun stop() {
		TODO("Not yet implemented")
	}

	override fun isRunning(): Boolean {
		TODO("Not yet implemented")
	}

	override fun onRefresh() {
		TODO("Not yet implemented")
	}

	override fun onClose() {
		TODO("Not yet implemented")
	}

	override fun setBeanFactory(beanFactory: BeanFactory) {
		this.beanFactory = beanFactory
	}

}