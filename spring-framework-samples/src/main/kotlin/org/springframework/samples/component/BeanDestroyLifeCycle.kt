package org.springframework.samples.component

import org.springframework.beans.factory.DisposableBean
import javax.annotation.PreDestroy

/**
 * bean 销毁周期
 * @author wangyong
 */
class BeanDestroyLifeCycle : DisposableBean {


	override fun destroy() {
		println("DisposableBean#destroy")
	}


	fun destroyMethod() {
		println("destroyMethod")
	}


	@PreDestroy
	fun preDestroy() {
		println("preDestroy")
	}

}