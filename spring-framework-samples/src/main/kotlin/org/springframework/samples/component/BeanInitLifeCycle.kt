package org.springframework.samples.component

import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

/**
 * bean初始化生命周期
 * @author wangyong
 */
class BeanInitLifeCycle : InitializingBean, DisposableBean {

	init {
		println("构造函数")
	}

	/**
	 * 只有annotation扫描的方式才会生效
	 */
	@PostConstruct
	fun postConstruct() {
		println("postConstruct")
	}


	fun initMethod() {
		println("init-method")
	}


	override fun afterPropertiesSet() {
		println("afterPropertiesSet")
	}

	override fun destroy() {
		println("销毁BeanInitLifeCycle")
	}

	@PreDestroy
	fun preDestroy(){
		println("pre-destory")
	}

	fun destroyMethod(){
		println("destroy-method")
	}

	var className:String = ""

}