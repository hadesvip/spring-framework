package org.springframework.samples.component

import org.springframework.beans.factory.InitializingBean
import javax.annotation.PostConstruct

/**
 * bean初始化生命周期
 * @author wangyong
 */
class BeanInitLifeCycle : InitializingBean {

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
	var className:String = ""


}